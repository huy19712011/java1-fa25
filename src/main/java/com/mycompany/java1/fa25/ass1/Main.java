package com.mycompany.java1.fa25.ass1;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        StudentManager menu = new StudentManager(service);
        menu.show();
    }

}
