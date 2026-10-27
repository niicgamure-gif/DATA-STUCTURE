Answers to the Questions

1. Why is the MedicalService class declared as abstract?

The MedicalService class is declared as abstract because it represents a general medical service. It provides common attributes and methods for its subclasses, while requiring each subclass to implement the calculateTotalcost() method and that you can not create an object for it directly.

2. What is the purpose of the abstract method calculateTotalcost()?

The purpose of this abstract method is to ensure that every subclass provides its own implementation for calculating the total cost of a medical service.

3. How does inheritance help reduce code duplication?

Inheritance reduces code duplication because common attributes and methods are defined in the parent class. The subclasses inherit these features instead of declaring them again.

4. How does polymorphism work in this program?

Polymorphism allows the same method, calculateTotalcost(), to behave differently depending on the type of medical service. For example, consultation, laboratory tests, and ultrasound services can each calculate their total costs differently.