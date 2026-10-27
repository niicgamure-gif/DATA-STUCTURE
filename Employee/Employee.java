package ASSIGMENT1AND2and3;

public class Employee {


        private String id;
        private String name;
        private String department;
        private double basicSalary;

        public  Employee(String id ,String name ,String department, double basicSalary){
            this.id = id;
            this.name = name;
            this.department = department;
            this.basicSalary = basicSalary;
        }

        public String getId(){
            return  id;
        }
        public void setId(String id){
            this.id = id;
        }
        public String getName(){
            return  name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getDepartment(){
            return  department;
        }
        public void setDepartment(String department){
            this.department= department;
        }
        public double getBasicSalary(){
            return  basicSalary;
        }
        public void setBasicSalary(double basicSalary){
            this.basicSalary = basicSalary;
        }

        public double CalculateSalary(){
            return getBasicSalary();
        }

        public String getCategory(){
            return "Employee";
        }

        public void display(){
            System.out.println("Employee ID : "+ getId());
            System.out.println("Employee Name : "+getName());
            System.out.println("Employee Department : "+ getDepartment());
            System.out.println("Category : "+ getCategory());
            System.out.println("Monthly Salary : $"+CalculateSalary());


        }


    }

    class FullTimeEmployee extends Employee{

        private double allowance;

        public FullTimeEmployee(String id ,String name , String department, double basicSalary , double allowance ){
            super(id,name,department,basicSalary);
            this.allowance = allowance;

        }
        public double getAllowance(){
            return  allowance;
        }
        public  void setAllowance(double allowance){
            this.allowance = allowance;
        }


        @Override
        public double CalculateSalary() {
            return super.CalculateSalary() + getAllowance();
        }


        @Override
        public String getCategory() {
            return "Full Time Employee";
        }

        @Override
        public void display() {
            super.display();
        }
    }
    class PartTimeEmployee extends Employee{

        private double hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(String id, String  name, String department , double basicSalary , double hoursWorked,double hourlyRate){
            super(id,name,department,basicSalary);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        public double getHoursWorked(){
            return  hoursWorked;
        }
        public void  setHoursWorked(double hoursWorked){
            this.hoursWorked = hoursWorked;
        }
        public double getHourlyRate(){
            return  hourlyRate;
        }
        public void  setHourlyRate(double hourlyRate){
            this.hourlyRate = hourlyRate;
        }


        @Override
        public double CalculateSalary() {
            return getHoursWorked() * getHourlyRate();
        }


        @Override
        public String getCategory() {
            return "Part Time Employee";
        }


        @Override
        public void display() {
            super.display();
        }
    }


    class Manager extends  Employee{

        private double bonus;
        public Manager(String id, String  name, String department , double basicSalary , double bonus){
            super(id,name,department,basicSalary);
            this.bonus = bonus;
        }

        public  double getBonus(){
            return  bonus;
        }
        public  void setBonus(double bonus){
            this.bonus = bonus;
        }

        @Override
        public double CalculateSalary() {
            return super.CalculateSalary() + getBonus();
        }

        public String getCategory() {
            return "Manager";
        }

        @Override
        public void display() {
            super.display();
        }
    }


    class mains {
        static void main() {
            Employee []  employees = {
                    new FullTimeEmployee("Emp001","Ahmed Ali","IT",600,50),
                    new PartTimeEmployee("Emp002","nahwa mohamed","Finance",400.0,20,12),
                    new Manager("Emp003","Zaynab Mohamud ","HR",900.0,300)};

            System.out.println("----- Employee Salary Report -----");
            for(Employee x :employees){
                x.display();
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println();
            }

        }
    }



