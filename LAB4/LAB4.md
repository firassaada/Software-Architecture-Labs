# LAB 4 :

### Architecture  :
Microservices architecture is ideal for this application because it allows the loan management system to be decomposed into independent services that can be developed, deployed, and scaled independently.
Each service corresponds to a business capability enhancing the maintainability and scalability of the system.
### Services :
- Commercial Service : Handles initial application processing, eligibility checks, and preliminary scoring based on the borrower's financial information.
- Risk Management Service : Performs deeper financial analysis, including debt ratio assessments and checks against central bank databases for outstanding financial commitments.  
- Credit Service : Finalizes the loan agreement, generates the amortization table, and handles document signing and storage.
- Notification Service : Manages communication with clients regarding the status of their loan applications.
- Document Management Service : Incorporates OCR capabilities to automate the extraction of information from uploaded documents.
### Diagram :
![image](https://github.com/firassaada/Software-Architecture-Labs/assets/93882105/94a03c9d-f928-4f00-9d63-3864902d348f)


## Implementations
## Commercial Service
The Commercial Service is responsible for handling the initial processing of loan applications. It performs eligibility checks and preliminary scoring based on the financial information provided by the borrower.
### `commercial_service.py`
```python
from flask import Flask, request, jsonify
from kafka import KafkaProducer

producer = KafkaProducer(bootstrap_servers='localhost:9092', value_serializer=lambda v: json.dumps(v).encode('utf-8'))
app = Flask(__name__)

@app.route('/process_application', methods=['POST'])
def process_application():
    data = request.get_json()
    applicant_name = data.get('name')
    applicant_income = data.get('income')
    applicant_credit_score = data.get('credit_score')
    
    if applicant_income < 30000 or applicant_credit_score < 600:
        return jsonify({'status': 'Rejected', 'reason': 'Insufficient income or low credit score'}), 400
    
    preliminary_score = (applicant_income / 1000) + applicant_credit_score

    producer.send('loan_applications', data)
    
    return jsonify({'status': 'Application processed', 'preliminary_score': preliminary_score})

if __name__ == '__main__':
    app.run(debug=True, port=5001)
```
### Sample Request
```bash
curl -X POST http://localhost:5001/process_application -H "Content-Type: application/json" -d '{
    "name": "Firas Saada",
    "income": 45000,
    "credit_score": 720
}'
```
## Risk Management Service
The Risk Management Service performs a deeper financial analysis of the loan application. This includes assessing the debt ratio and checking against central bank databases for outstanding financial commitments.
### `risk_management_service.py`
```python
from flask import Flask, request, jsonify
from kafka import KafkaConsumer, KafkaProducer
import json

app = Flask(__name__)

producer = KafkaProducer(bootstrap_servers='localhost:9092', value_serializer=lambda v: json.dumps(v).encode('utf-8'))
consumer = KafkaConsumer('loan_applications', bootstrap_servers='localhost:9092', value_deserializer=lambda m: json.loads(m.decode('utf-8')))

@app.route('/analyze_risk', methods=['POST']) # Can be removed ( we can use a normal script rather than a Flask API )
def analyze_risk():
    data = request.get_json()
    applicant_debt = data.get('debt')
    applicant_income = data.get('income')
    applicant_credit_score = data.get('credit_score')
    
    debt_ratio = applicant_debt / applicant_income
    
    central_bank_check = 'clear' if applicant_credit_score >= 700 else 'issues found'
    
    risk_score = (applicant_income / 1000) + (700 - debt_ratio * 100) + applicant_credit_score
    
    risk_assessment = {
        'debt_ratio': debt_ratio,
        'central_bank_check': central_bank_check,
        'final_risk_score': risk_score
    }
    
    producer.send('risk_analysis', risk_assessment)
    
    return jsonify(risk_assessment)

if __name__ == '__main__':
    app.run(debug=True, port=5002)

def consume_messages():
    for message in consumer:
        data = message.value
        analyze_risk(data)

import threading
thread = threading.Thread(target=consume_messages)
thread.start()
```
### Sample Request
```bash
curl -X POST http://localhost:5002/analyze_risk -H "Content-Type: application/json" -d '{
    "debt": 15000,
    "income": 60000,
    "credit_score": 720
}'
```
## Running the Services
Each service can be run independently on different ports as shown in the code snippets.
