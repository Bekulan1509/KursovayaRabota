package com.company;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        System.out.println("введите возраст");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        user.getAge(age);



        try {
            user.setAge(age);

        } catch (IllegalAgeException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("введите имя");
        String name = scanner.next();

        user.getName(name);

        try {
            user.setName(name);
        } catch (IllegalCharsetNameException e) {
            System.out.println(e.getMessage());
        }


    }



}
