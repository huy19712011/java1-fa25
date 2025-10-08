package com.mycompany.java1.fa25.ass1;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Menu menu = new Menu(service);
        menu.show();
    }

}
