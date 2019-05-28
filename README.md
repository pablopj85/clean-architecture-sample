# clean-architecture-sample

The Clean Architecture Sample is a demo project that gives a general overview of how a project can be structured with a hexagonal architecture.

The project is structured in the following modules or layers:

### domain
This module implements the domain layer and it doesn't have dependency about any other module. Therefore, contains the interfaces and class that represents the concepts of the project.

### application
This module implements the application layer and it have a dependency about the domain layer, here the business logic of each use case is implemented. Each use case will be independent of each other and will not call to another for not coupling behaviors.

### infraestructure
This module implements everything outside the business logic and will have a dependency on the application module. Here the interfaces that have been defined in the domain module, the controllers and the access to the data repository will be implemented.

### boot
In this module declare the boot class of the application.