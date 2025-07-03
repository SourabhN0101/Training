package com.inheritance;
import java.util.Scanner;
class Employee {

	    String name;
	    int id;

	    Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	    }
	}

	class Manager extends Employee {
	    String department;

	    Manager(String name, int id, String department) {
	        super(name, id);
	        this.department = department;
	    }

	    @Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Department: " + department);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline add method on this code
	        System.out.print("Enter department: ");
	        String dept = sc.nextLine();

	        Manager manager = new Manager(name, id, dept);
	        manager.displayDetails();
	        sc.close();
	    }
	}
 