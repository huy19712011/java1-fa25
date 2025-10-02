package com.mycompany.java1.fa25.lab3;


import com.mycompany.java1.fa25.lab1.Bai1;
import com.mycompany.java1.fa25.lab2.Bai5;
import java.util.Scanner;

public class MenuDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int luaChon;

        System.out.println("Menu example");

        do {
            System.out.println("Menu");
            System.out.println("1: Bai 1");
            System.out.println("11: Lab 1 - Bai 1");
            System.out.println("2: Bai 2");
            System.out.println("3: Bai 3");
            System.out.println("9: Thoat");

            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    Bai5.lab2Bai5();
                    break;
                case 11:
                    Bai1.lab1Bai1();
                    break;
            }

        } while (luaChon != 9);
    }

}
