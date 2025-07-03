package com.polymorphism;

//Superclass
class Animal {
 void sound() {
     System.out.println("Animal makes sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 void sound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 void sound() {
     System.out.println("Cat meows");
 }
}

//Main class
public class Polymorphism {
 public static void main(String[] args) {
     Animal[] animals = new Animal[3];
     animals[0] = new Dog();
     animals[1] = new Cat();
     animals[2] = new Dog();

     for (Animal a : animals) {
         a.sound(); // Calls overridden method
     }
 }
}