package com.mycompany.java1.fa25.lab1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        lab1Bai1();
    }

    public static void lab1Bai1() {
        System.out.print("Nhap ten: ");

        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();

        System.out.print("Nhap diem TB: ");
        float diemTB = scanner.nextFloat();

        System.out.printf("Sinh vien %s dat diem %.2f%n", ten, diemTB);
    }

}
