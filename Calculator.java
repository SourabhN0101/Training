package com.training;

import java.util.Scanner;

public class Calculator {

     //Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("\nError: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("Simple Java Calculator");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            String operator;
            while (true) {
                System.out.print("Choose operation (+, -, *, /): ");
                operator = scanner.next();

                double result;

                switch (operator) {
                    case "+":
                        result = add(num1, num2);
                        System.out.println("\nResult: " + result);
                        break;
                    case "-":
                        result = subtract(num1, num2);
                        System.out.println("\nResult: " + result);
                        break;
                    case "*":
                        result = multiply(num1, num2);
                        System.out.println("\nResult: " + result);
                        break;
                    case "/":
                        result = divide(num1, num2);
                        System.out.println("\nResult: " + result);
                        break;
                    default:
                        System.out.println("Invalid operator. Try again.");
                        continue;
                }
                break; // exit loop if valid operation
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                continueCalc = false;
            }
        }

        System.out.println("\nThank you for using the calculator!");
        scanner.close();
    }
}
