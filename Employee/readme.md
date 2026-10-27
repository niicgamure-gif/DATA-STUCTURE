# Employee Salary Management System
## Description

This is a java assignment, designed to manage the different types of employee in one organized code . i use it some of OOPS concepts such as : **Encapsulation** when i declared fields as private and  create  methods to read and upadte their values,**Inheritance** this concept is about one class inheriting another class . I created  one parent class called "Employee " and three sub classes "FullTimeEmployee ,PartTimeEmployee ,  Manager", last i used **Polymorphism** concept or feature  i created one method then reuse it in every class with different implementation.

## Answering the questions
### 1. What is the superclass, and what are the subclasses?
The superclass is : `Employee`
and the subclasses are :`FullTimeEmployee ,PartTimeEmployee and  Manager`.

### 2. How does inheritance reduce code duplication?
Inheritance reduces code duplication because common attributes and methods can be defined once in a superclass. Other classes can inherit them instead of creating the same attributes and methods again.

### 3. Identify the method that demonstrates polymorphism.
The method that demonstrate polymorphism is "CalculateSalary"
because every class use it in different way .
### 4. Explain why @Override is used.
@Override is used because it shows that  the class inheritance the method from it's parentclass and methods are same signature and same return type.