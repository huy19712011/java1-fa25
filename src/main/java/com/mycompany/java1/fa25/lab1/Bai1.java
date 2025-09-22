package com.mycompany.java1.fa25.lab1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

//        System.out.println("Lab 1 - Bai 1 ");

        System.out.print("Nhap ten: ");

        Scanner scanner = new Scanner(System.in);
//        String ten = scanner.next();
        String ten = scanner.nextLine();
//        System.out.println(ten);

        System.out.print("Nhap diem TB: ");
        float diemTB = scanner.nextFloat();
//        System.out.println(diemTB);

        System.out.printf("Sinh vien %s dat diem %.2f", ten, diemTB);



    }

}
