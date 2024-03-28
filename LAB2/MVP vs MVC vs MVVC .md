# MVP :

  Model: Represents the data and business logic of the application.
  View: Represents the UI elements, what the user sees.
  Presenter: Acts as an intermediary between the Model and the View. It retrieves data from the Model, processes it, and updates the View accordingly. In MVP, the View and   
  the Model are completely decoupled, and the Presenter manages the communication between them.

  ![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/8b1be765-ce28-441f-921b-7ad35e1f7b8a)

 ## Advantages:
        Allows for easier testing and maintenance of individual components.
        Promotes reusability of components.

 ## Disadvantages:
        Can result in tight coupling between View and Controller.
        Complex navigation and state management might be challenging.

 ## Use Cases:
        Well-suited for traditional web applications with server-side rendering.
        Suitable for applications with simpler UI logic and navigation flows.
# MVC :

  Model: Same as in MVP, represents the data and business logic.
  View: Same as in MVP, represents the UI elements.
  Controller: It handles user input, processes it, and updates both the Model and the View. In MVC, the Controller acts as an intermediary between the Model and the View.      Unlike MVP, in MVC, the View can directly communicate with the Model.

  ![image](https://github.com/firassaada/Software-Architecture-Labs/assets/94303698/6595363b-c90f-47f3-be01-9376a95edefd)

# MVVP :

MVVM (Model-View-ViewModel):

  Model: Represents the data and business logic.
  View: Represents the UI elements.
  ViewModel: It acts as a mediator between the View and the Model. The ViewModel exposes data and commands from the Model to the View and handles user interactions. Unlike     the Presenter in MVP or the Controller in MVC, the ViewModel does not have a direct reference to the View. Instead, it uses data binding to communicate changes between th    View and the ViewModel.
