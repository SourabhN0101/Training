package com.polymorphism;
//Abstract class
abstract class Employee {
 String name;

 public Employee(String name) {
     this.name = name;
 }

 // Abstract method
 abstract double calculateSalary();
}

//Full-time employee
class FullTimeEmployee extends Employee {
 double monthlySalary;

 public FullTimeEmployee(String name, double monthlySalary) {
     super(name);
     this.monthlySalary = monthlySalary;
 }

 double calculateSalary() {
     return monthlySalary;
 }
}

//Part-time employee
class PartTimeEmployee extends Employee {
 double hourlyRate;
 int hoursWorked;

 public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
     super(name);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

//Main class
public class EmployeeDemo {
 public static void main(String[] args) {
     Employee e1 = new FullTimeEmployee("Sourabh", 30000);
     Employee e2 = new PartTimeEmployee("Omkar", 200, 40);

     System.out.println(e1.name + "'s Salary: ₹" + e1.calculateSalary());
     System.out.println(e2.name + "'s Salary: ₹" + e2.calculateSalary());
 }
}
