package com.mycompany.java1.fa25.lab4_OOP;

import java.util.Scanner;

public class ClassObjectDemo {

    public static void main(String[] args) {
        System.out.println("OOP basics");

        Student student = new Student();
        student.input();
        student.output();
    }

}

class Student {

    // fields
    private Long id;
    private String name;
    private String email;
    private String phone;

    // constructor(s)

    public Student() {

    }

    public Student(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    // methods (member functions)
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
//        this.id = Long.parseLong(scanner.nextLine());
        this.id = scanner.nextLong();
        scanner.nextLine(); // sua loi khong doc "name" tai day!!!

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter email: ");
        this.email = scanner.nextLine();
        System.out.print("Enter phone: ");
        this.phone = scanner.nextLine();
    }

    public void output() {
        System.out.printf("Student: id = %d, name = %s, email = %s, phone = %s", id, name, email, phone);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}