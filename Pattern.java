package com.loop;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Star pattern:\n");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

