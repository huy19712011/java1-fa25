package com.mycompany.java1.fa25.lab3;

public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("Array examples");

//        //1.
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[0]);
//        cars[0] = "Toyota";
//        System.out.println(cars[0]);
//        System.out.println(cars.length);
//        //2.
//        String[] cars = new String[4]; // size is 4
//        cars[0] = "Volvo";
//        cars[1] = "BMW";
//        cars[2] = "Ford";
//        cars[3] = "Mazda";
//        System.out.println(cars[0]); // Outputs Volvo
//        //3.
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//        //4.
//        int[] numbers = {1, 5, 10, 25};
//        int sum = 0;
//        // Loop through the array and add each element to sum
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("The sum is: " + sum);

        //5. for each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }

    }

}
