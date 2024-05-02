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
- Microservices Architecture: By dividing the system into discrete services (Forecast, Planning, Auth), you ensure that each component can be scaled independently based on demand. This modularity facilitates horizontal scaling, which is adjusting the number of instances of each service according to its load.
- API Gateway: Serves as a single point of entry that routes requests to the appropriate microservices, enabling load balancing and effective management of traffic spikes.
## Availability and Reliability:
- Kubernetes: Provides self-healing features with automatic placement, restarts, and replication of containerized applications. This ensures that services are always available and can recover quickly from hardware failures.
- Pod Distribution: Deploying microservices in separate pods within a Kubernetes cluster ensures that failures in one service do not impact others, enhancing fault tolerance.
## Security:
- Auth Microservice: Centralizes authentication and potentially authorization functions, which simplifies security management by isolating security mechanisms from business logic services.
- API Gateway: Acts as the security layer that can enforce SSL/TLS, authenticate API requests, and prevent direct external access to backend services, reducing the attack surface.
# 4) Propose Some Key Technologies to Use and Explain Why
## Kubernetes:
Why: It automates the deployment, scaling, and operations of application containers across clusters of hosts. Kubernetes excels in managing microservices due to its robust orchestration capabilities, including load balancing, service discovery, and self-healing.
## Docker:
Why: Containerization technology that encapsulates a microservice and its dependencies in a container image. This promotes consistency across development, testing, and production environments, enhancing the reliability and portability of microservices.
## API Gateway (e.g., Kong, Amazon API Gateway):
Why: Manages all incoming API requests and routes them to the correct microservices. It can handle security concerns such as authentication and rate limiting, and improve performance through caching.
## OAuth2 and JWT:
Why: OAuth2 provides a robust authorization framework, which is crucial for services dealing with sensitive data or requiring user authentication. JWT is used for securely transmitting information between parties as JSON objects, allowing for stateless authentication.
## PostgreSQL/MySQL:
Why: These relational databases offer strong consistency, reliability, and support for complex queries with transactional integrity, which is essential for services like the Forecast and Planning microservices that handle significant data operations.
