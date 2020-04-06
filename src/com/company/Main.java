package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean verify;

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        int arrayLenght = scanner.nextInt();

        String[] array = new String[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = scanner.next();
        }
        System.out.println("================================================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================================================");
        String element = scanner.next();
        int index = check(element, array);
        if (verify) {
            System.out.println("the index of " + element + " is " + index);
        } else
            System.out.println("not found");

    }

    static int check(String value, String[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(value)) {
                index = i;
                verify = true;
            }
        }
        return index;
    }

}
