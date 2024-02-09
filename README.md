# Java Design Patterns Implementation

This repository contains Java code examples for various design patterns implemented using Object-Oriented Programming (OOP) principles. The included design patterns are:

- Singleton Pattern
- Prototype Pattern
- Factory Pattern
- Builder Pattern
- Abstract Factory Pattern
- Adapter Pattern
- Facade Pattern
- Decorator Pattern
- Proxy Pattern
- Bridge Pattern
- Composite Pattern
- Flyweight Pattern
- Chain of Responsibility Pattern
- Command Pattern
- State Pattern
- Strategy Pattern
- Template Pattern
- Iterator Pattern
- Mediator Pattern
- Memento Pattern
- Observer Pattern
- Visitor Pattern

Each design pattern is organized into its own folder within the `src/` directory for easy navigation and understanding.

## Table of Contents

- [Design Patterns](#design-patterns)
  - [Singleton Pattern](#singleton-pattern)
  - [Prototype Pattern](#prototype-pattern)
  - [Factory Pattern](#factory-pattern)
  - [Builder Pattern](#builder-pattern)
  - [Abstract Factory Pattern](#abstract-factory-pattern)
  - [Adapter Pattern](#adapter-pattern)
  - [Facade Pattern](#facade-pattern)
  - [Decorator Pattern](#decorator-pattern)
  - [Proxy Pattern](#proxy-pattern)
  - [Bridge Pattern](#bridge-pattern)
  - [Composite Pattern](#composite-pattern)
  - [Flyweight Pattern](#flyweight-pattern)
  - [Chain of Responsibility Pattern](#chain-of-responsibility-pattern)
  - [Command Pattern](#command-pattern)
  - [State Pattern](#state-pattern)
  - [Strategy Pattern](#strategy-pattern)
  - [Template Pattern](#template-pattern)
  - [Iterator Pattern](#iterator-pattern)
  - [Mediator Pattern](#mediator-pattern)
  - [Memento Pattern](#memento-pattern)
  - [Observer Pattern](#observer-pattern)
  - [Visitor Pattern](#visitor-pattern)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Design Patterns

### Singleton Pattern

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance. It is implemented in the `SingletonPattern` folder.

### Prototype Pattern

The Prototype Pattern creates new objects by copying an existing object, known as the prototype. It is implemented in the `PrototypePattern` folder.

### Factory Pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. It is implemented in the `FactoryPattern` folder.

### Builder Pattern

The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It is implemented in the `BuilderPattern` folder.

### Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is implemented in the `AbstractFactoryPattern` folder.

### Adapter Pattern

The Adapter Pattern allows the interface of an existing class to be used as another interface. It is implemented in the `Adapter` folder.

### Facade Pattern

The Facade Pattern provides a simplified, higher-level interface to a set of interfaces in a subsystem. It is implemented in the `Facade` folder.

### Decorator Pattern

The Decorator Pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is implemented in the `DecoratorPattern` folder.

### Proxy Pattern

The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. It is implemented in the `ProxyPattern` folder.

### Bridge Pattern 

The Bridge Pattern decouples abstraction from implementation, allowing them to vary independently. It is implemented in the `BridgePattern` folder.

### Composite Pattern

The Composite Pattern composes objects into tree structures to represent part-whole hierarchies. It is implemented in the `CompositePattern` folder.

### Flyweight Pattern

The Flyweight Pattern minimizes memory usage or computational expenses by sharing as much as possible with related objects. It is implemented in the `FlyweightPattern` folder.

### Chain of Responsibility Pattern

Chain of Responsibility Pattern passes a request along a chain of handlers, each having the ability to process or pass it to the next handler. It is implemented in the `ChainOfResponsibilityPattern` folder.

### Command Pattern

Command Pattern encapsulates a request as an object, allowing parameterization of clients with different requests, queuing, and logging of requests. It is implemented in the `CommandPattern` folder.

### State Pattern

State Pattern alters an object's behavior when its internal state changes, allowing it to appear as if the object has changed its class. It is implemented in the `StatePattern` folder.

### Strategy Pattern

Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the client to choose the appropriate one. It is implemented in the `StrategyPattern` folder.

### Template Pattern

Template Pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure. It is implemented in the `TemplatePattern` folder.

### Iterator Pattern

Iterator Pattern provides a way to access elements of an aggregate object sequentially without exposing its underlying representation. It is implemented in the `IteratorPattern` folder.

### Mediator Pattern

Mediator Pattern defines an object that centralizes communication between other objects, promoting loose coupling. It is implemented in the `MediatorPattern` folder.

### Memento Pattern

Memento Pattern captures and externalizes an object's internal state so that it can be restored to this state later. It is implemented in the `MementoPattern` folder.

### Observer Pattern

Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.  It is implemented in the `ObserverPattern` folder.

### Visitor Pattern

Visitor Pattern represents an operation to be performed on the elements of an object structure, allowing the definition of new operations without changing the classes of the elements. It is implemented in the `VisitorPattern` folder.

## Getting Started

### Prerequisites

To run the code examples in this repository, you need the following:

- Java Development Kit (JDK) installed on your system.
- A Java Integrated Development Environment (IDE) or a code editor of your choice.

### Usage

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/ezrantn/jdp.git
   ```
2. Navigate to the specific design pattern folder you want to explore, e.g., `SingletonPattern`.
3. Open the project in your preferred Java IDE or code editor.
4. Compile and run the Java files to see the design pattern in action.

## Contributing
If you'd like to contribute to this repository by adding more design patterns, improving code examples, or fixing issues, please open a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/umjiiii/design-patterns-oop/blob/main/LICENSE) file for details.
