# Logistics Patterns

## Project Description

This project is a Java logistics application that demonstrates two design patterns:

- Factory Method
- Abstract Factory

The application supports two delivery types:

- Road delivery
- Sea delivery

It also supports two user interface platforms:

- Windows
- MacOS

The user selects the delivery type and platform at runtime.

## Technologies

- Java JDK 17
- IntelliJ IDEA
- Git and GitHub

No external libraries are required.

## Project Structure

```text
src/main/java/
├── abstractfactory/
│   ├── Button.java
│   ├── Checkbox.java
│   ├── GUIFactory.java
│   ├── MacOSButton.java
│   ├── MacOSCheckbox.java
│   ├── MacOSFactory.java
│   ├── WindowsButton.java
│   ├── WindowsCheckbox.java
│   └── WindowsFactory.java
│
├── application/
│   └── DeliveryApplication.java
│
├── factorymethod/
│   ├── Logistics.java
│   ├── RoadLogistics.java
│   ├── SeaLogistics.java
│   ├── Ship.java
│   ├── Transport.java
│   └── Truck.java
│
└── main/
    └── Main.java