# MVP :

  Model: Represents the data and business logic of the application.
  View: Represents the UI elements, what the user sees.
  Presenter: Acts as an intermediary between the Model and the View. It retrieves data from the Model, processes it, and updates the View accordingly. In MVP, the View and   
  the Model are completely decoupled, and the Presenter manages the communication between them.

  ![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/8b1be765-ce28-441f-921b-7ad35e1f7b8a)

## Advantages:
        *Similar to MVC but with a passive View, reducing the risk of Massive View problem.
        *Improved testability as business logic is separated into Presenter.

 ## Disadvantages:
        *Still prone to some degree of coupling between View and Presenter.
        *Requires more code compared to MVC.

 ## Use Cases:
        *Commonly used in desktop and web applications where there's a need for a clear separation between UI and business logic.
        *Suitable for applications with complex UI logic and interactions.

# MVC :

  Model: Same as in MVP, represents the data and business logic.
  View: Same as in MVP, represents the UI elements.
  Controller: It handles user input, processes it, and updates both the Model and the View. In MVC, the Controller acts as an intermediary between the Model and the View.      Unlike MVP, in MVC, the View can directly communicate with the Model.

  ![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/6595363b-c90f-47f3-be01-9376a95edefd)

 ## Advantages:
        *Allows for easier testing and maintenance of individual components.
        *Promotes reusability of components.

 ## Disadvantages:
        *Can result in tight coupling between View and Controller.
        *Complex navigation and state management might be challenging.

 ## Use Cases:
        *Well-suited for traditional web applications with server-side rendering.
        *Suitable for applications with simpler UI logic and navigation flows.
        
# MVVM :

  Model: Represents the data and business logic.
  View: Represents the UI elements.
  ViewModel: It acts as a mediator between the View and the Model. The ViewModel exposes data and commands from the Model to the View and handles user interactions. Unlike     the Presenter in MVP or the Controller in MVC, the ViewModel does not have a direct reference to the View. Instead, it uses data binding to communicate changes between th    View and the ViewModel.

![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/fd809734-d5af-41da-a599-35cc8e94fd5e)

## Advantages:
        *Enables a clear separation between UI and business logic.
        *Facilitates two-way data binding, reducing the need for manual updates to the UI.
   
## Disadvantages:
        *Can introduce a steep learning curve, especially for developers new to reactive programming.
        *Overuse of data binding can lead to performance issues.
   
## Use Cases:
        *Widely used in modern web and mobile applications, especially those built with frameworks like Angular or React Native.
        *Suitable for applications with dynamic UIs and complex data manipulation requirements.


