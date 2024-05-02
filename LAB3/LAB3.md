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
