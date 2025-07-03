package com.inheritance;

import java.util.Scanner;

// Parent class
class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class
class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year); // Call Vehicle constructor
        this.model = model;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent displayInfo()
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        // Create Car object
        Car car = new Car(brand, year, model);

        // Display info
        car.displayInfo();

        sc.close();
    }
}
