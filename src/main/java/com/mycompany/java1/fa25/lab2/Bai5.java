package com.mycompany.java1.fa25.lab2;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        System.out.println("Lab2 - Bai 5");

        // Nhap hoten, diem toan, ly, hoa
        // Tinh diem tb
        // Xep loai:
        // 9 - 10: Xuat sac
        // 8 - 9 : Gioi
        // 7 - 8: Kha
        // 5 - 7: TB
        // <5: Yeu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem toan: ");
        float toan = scanner.nextFloat();
        System.out.print("Nhap diem ly: ");
        float ly = scanner.nextFloat();
        System.out.print("Nhap diem hoa: ");
        float hoa = scanner.nextFloat();

        float diemTB = (toan + ly + hoa) / 3;

        String xepLoai = null;

        if (10 >= diemTB && diemTB >= 9) {
            xepLoai = "Xuat Sac";
        }
        else if (9 > diemTB && diemTB >= 8)
        {
            xepLoai = "Gioi";
        }
        else if (8 > diemTB && diemTB >= 7)
        {
            xepLoai = "Kha";
        }
        else if (7 > diemTB && diemTB >= 5)
        {
            xepLoai = "TB";
        }
        else
        {
            xepLoai = "Yeu";
        }

        System.out.printf("Sinh vien %s dat diem TB %.2f, xep loai %s", hoTen, diemTB, xepLoai);

    }

}
