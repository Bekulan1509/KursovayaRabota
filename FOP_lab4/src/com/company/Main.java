package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\tTask 1: ");
//        System.out.println("Maximum : ");
//        System.out.println(maximum(23, 45, 25));
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 2: ");
//        System.out.println("Minimum value : ");
//        System.out.println(minimum(21.00, 21.00, 21.00));
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 3: ");
//        System.out.println("\tTask C : ");
//        task3cProduct(2, 2, 3);
//        System.out.println("---------------------------------");
//        System.out.println("\tTask A : ");
//        System.out.println(task3aSum(2, 2, 5));
//        System.out.println("---------------------------------");
//        System.out.println("\tTask B : ");
//        task3bPrintResults(2, 2);
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 4: ");
//        System.out.println("Enter index (number) : ");
//        int num = scanner.nextInt();
//        System.out.println(task4(num));
//        System.out.println("---------------------------------");
        System.out.println("\tTask 5: ");
        System.out.println("Enter  number x : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter  number y : ");
        int num3 = scanner.nextInt();
        System.out.println("NOD : ");
        System.out.println(task5(num2, num3));
    }

    // 1.Напишите программу, которая использует шаблон функции maximum для поиска максимального из трех целых чисел,
    // трех чисел с плавающей запятой и трех символов.
    static <T extends Comparable<T>> T maximum(T n, T m, T j) {
        T max = n;
        if (n.compareTo(m) > 0) {
            max = n;
        }
        if (j.compareTo(max) > 0) {
            max = j;
        }
        return max;
    }

    //    2. Напишите программу, которая использует шаблон функции по
//    имени min для определения наименьшего из трех аргументов.
//    Проверьте программу, используя пары целых чисел, символов и чисел с плавающей
//    запятой.
    static <T extends Comparable<T>> T minimum(T n, T m, T j) {
        T min = n;
        if (n.compareTo(m) > 0) {
            min = m;
        }
        if (min.compareTo(j) > 0)
            min = j;

        return min;
    }

    //a) template < class A >
    // int sum ( int numl , int num2, int num3 ) { return numl + num2 + num3; )
    // b) void printResults ( int x, int y )
    //{ cout « "Сумма равна " « x + у « ' \n' ;
    //return x + y; }
    //c) template < class A>
    //A product ( A numl, A num2, A num3 ) { return numl * num2 * num3; }
    // double cube ( int ) ; int cube ( int );

    static <T> void task3cProduct(T numl, T num2, T num3) {
        int suml = (int) numl;
        int sum2 = (int) num2;
        int sum3 = (int) num3;
        int sum = suml * sum2 * sum3;
        System.out.println(sum);
    }

    static int task3aSum(int numl, int num2, int num3) {
        return numl + num2 + num3;
    }

    static void task3bPrintResults(int x, int y) {
        System.out.println("The Summa equals =  " + x + y);
    }

    //  4. Ряд Фибонначи состоит из чисел, каждое из которых является суммой двух предыдущих(1, 1, 2, 3, 5, 8, 13, ...).
    //   Найти n-ный элемент ряда, используя рекурсию.
    static int task4(int number) {
        int task = number;
        if (number <= 2) {
            return 1;
        } else {
            task = (task4(number - 2)) + (task4(number - 1));
        }

        return task;
    }

    //Наибольшийобщийделитель(НОД)двухцелыхчиселхиу—это наибольшее целое,
    // на которое без остатка делится каждое из двух чисел. Напишите рекурсивную функцию nod,
    // которая возвращает наибольший общий делитель чисел х и у.
    // НОД для х и у определяется рекурсивно следующим образом: если у равно 0,
    // то nod(x, у) возвращает х; в противном случае nod(x, у) равняется nod(y, х % у),
    // где % — это операция вычисления остатка.
    static int task5(int x, int y) {
        int nod = task5(y, x % y);
        if (y == 0) {
            return x;
        } else
            return nod;
    }
}

