package com.mycompany.java1.fa25.lab3;

public class ForLoopDemo {

    public static void main(String[] args) {
        System.out.println("For loop examples");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i < 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }

}
