# 1)  Choose and explain the appropriate architecture for the described solution.
We think a Microservices Architecture would be the most appropriate choice. A Microservices Architecture provides the necessary flexibility, scalability, modularity,
and resilience required for building a complex Forecast and Planning application like the one described for INSATix .

# 2) Use different UML diagrams to represent several views of these systems.
## Component Diagram :

![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/1fb202c4-0a10-42ae-95ba-835f4febe715)

## Sequence Diagram : 

![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/4d65fa44-22de-4d31-9936-a3e443f0ea62)

## Class Diagram :

![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/b5591430-f055-4723-8426-b126767fadc4)

# 3) Emphasize the design choices for every non functional requirement and constraint.
## Scalability:
- Microservices Architecture: Divides the system into specific services like Forecast, Planning, and Auth, each scalable independently, facilitating horizontal scaling.
- API Gateway: Manages traffic via a single entry point, enhancing load balancing and traffic spike management.
## Availability and Reliability:
- Kubernetes: Supports automatic management of containerized apps, ensuring continuous availability and quick recovery from failures.
- Pod Distribution: Places microservices in separate pods within a Kubernetes cluster to improve fault tolerance.
## Security:
- Auth Microservice: Centralizes authentication, isolating it from business logic for streamlined security management.
- API Gateway: Adds a security layer that handles SSL/TLS, authenticates API requests, and limits direct backend access, reducing vulnerability.
# 4) Propose Some Key Technologies to Use and Explain Why
## Kubernetes (e.g. Amazon Elastic Kubernetes Service ) :
Why: Automates container application operations across host clusters, ideal for microservices with features like load balancing and self-healing.
## Docker (e.g. Amazon Elastic Container Registry ) :
Why: Containerizes microservices ensuring consistency across all environments, which enhances reliability and portability.
## API Gateway (e.g. Amazon API Gateway):
Why: Routes API requests to correct microservices, handling security and performance enhancements like caching.
## OAuth2 and JWT:
Why: OAuth2 offers a secure authorization framework, crucial for sensitive data. JWT facilitates secure, stateless JSON information exchange.
## PostgreSQL/MySQL:
Why: Provides reliable, consistent database management with transactional integrity, essential for data-intensive services like Forecast and Planning.
