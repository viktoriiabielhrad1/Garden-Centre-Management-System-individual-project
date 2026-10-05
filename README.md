Garden Centre Management System
-
A pure Java application that simulates the operations of a garden centre. The system models plants, 
staff, stock levels, daily sales, and customer interactions using object‑oriented programming 
principles such as abstraction, inheritance, encapsulation, and method overriding.

Overview
-
The project is built around a set of interconnected classes representing real‑world entities: plants,
gardeners, staff, store inventory, and the garden centre itself. A CLI interface allows users to perform actions such as selling plants, checking stock, requesting advice, and viewing daily sales.

Class Structure
-
Plant (Abstract Superclass)
Defines shared attributes such as price, type, watering needs, lifetime, height range, soil types,
colours, and sale readiness. Subclasses extend this class.

Bonsai & Cacti (Subclasses)
-
Concrete plant types inheriting all properties from Plant and using the superclass constructor.

Gardener
-
Represents a gardener with actions such as planting, feeding, watering, picking, and giving advice.

Staff
-
Handles commission, requests, and interactions with the store.

Store
-
Manages stock levels for bonsai and cacti, daily sales, and operations such as selling plants, 
dropping stock, and displaying inventory.

GardenCenter
-
Coordinates store operations, calculates commissions, starts the working day, and displays total sales.

CLI
-
Provides the user interface for interacting with the system through menu options.

Use Case Coverage
-
The system supports:
Selling bonsai and cacti
Entering quantities
Viewing stock levels
Tracking daily sales
Asking for gardener advice
Exiting the program

Key Concepts Demonstrated
-
Abstract classes and inheritance
Encapsulation with getters and setters
Method implementation across multiple classes
Object interaction and state changes
Command‑line interface design

Purpose
-
This project was developed as part of a Java OOP module to demonstrate class design,
UML interpretation, and real‑world system modelling using pure Java.
