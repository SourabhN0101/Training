package com.polymorphism;
//Interface
interface Playable {
 void play();
}

//Guitar class implementing Playable
class Guitar implements Playable {
 public void play() {
     System.out.println("Playing the Guitar");
 }
}

//Piano class implementing Playable
class Piano implements Playable {
 public void play() {
     System.out.println("Playing the Piano");
 }
}

//Main class
public class Music {
 public static void main(String[] args) {
     Playable p1 = new Guitar();
     Playable p2 = new Piano();

     p1.play();
     p2.play();
 }
}
