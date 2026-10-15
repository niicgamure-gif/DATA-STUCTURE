# data structure
nahwa mohamed abdikadir id :C1240168

Description: Hospital Package Using Inheritance

This project is a Hospital Package system developed using Object-Oriented Programming (OOP) and Inheritance. It consists of three classes: Patient, Outpatient, and Inpatient.

1. Patient Class

The Patient class is the superclass. It contains two protected variables, name and consultFee. Its constructor is used to initialize the patient’s name and consultation fee. These properties are inherited by the Outpatient and Inpatient classes.

2. Outpatient Class

The Outpatient class inherits from the Patient class. It represents patients who visit the hospital for treatment without staying overnight. It has an additional variable called labCharge. The CalculateBill() method adds the consultation fee and laboratory charge to get the total bill. The Display() method shows the patient’s details and total bill.

3. Inpatient Class

The Inpatient class also inherits from the Patient class. It represents patients who stay in the hospital for treatment. It contains two additional variables: roomCharge and numberOfDays. The CalculateBill() method multiplies the room charge by the number of days and adds the consultation fee. The Display() method shows the patient’s details and total cost.

4. Main Method

The Main method creates objects for the Outpatient and Inpatient classes. It provides sample patient names and charges, then calls the Display() method to print the patient information and total bills.
