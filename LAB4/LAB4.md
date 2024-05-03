# LAB 4 :

Microservices architecture is ideal for this application because it allows the loan management system to be decomposed into independent services that can be developed, deployed, and scaled independently.

Each service corresponds to a business capability enhancing the maintainability and scalability of the system.
### Services :
- Commercial Service : Handles initial application processing, eligibility checks, and preliminary scoring based on the borrower's financial information.
- Risk Management Service : Performs deeper financial analysis, including debt ratio assessments and checks against central bank databases for outstanding financial commitments.  
- Credit Service : Finalizes the loan agreement, generates the amortization table, and handles document signing and storage.
- Notification Service : Manages communication with clients regarding the status of their loan applications.
- Document Management Service : Incorporates OCR capabilities to automate the extraction of information from uploaded documents.
