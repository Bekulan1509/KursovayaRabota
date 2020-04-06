package com.company;

import java.util.Scanner;

public class Main {

    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("square : ");
//        System.out.println(one(9, 6, 0));
//        System.out.println("gipotenuza : ");
//        System.out.println(oneGipotenuza(9, 6, 0));
//        System.out.println("-----------------------------------");
//        System.out.println("square : ");
//        System.out.println(two(5, 7, 0));
//        System.out.println("volume : ");
//        System.out.println(twoVolume(5, 7, 5, 0));
//        System.out.println("-----------------------------------");
//        System.out.println("Enter quantity soms :");
//        double kolSom = scanner.nextDouble();
//        System.out.println("kolRub : ");
//        System.out.println(three(1.02, kolSom));
//        System.out.println("kolDol : ");
//        System.out.println(threeKolDol(69.85, kolSom));
        System.out.println("-----------------------------------");
//        System.out.println("Enter hour : ");
//        int hour = scanner.nextInt();
//        System.out.println("Enter minutes : ");
//        int minutes = scanner.nextInt();
//        System.out.println("Enter seconds : ");
//        int seconds = scanner.nextInt();
//        System.out.println(four(hour, minutes, seconds));
//        System.out.println("-----------------------------------");
//       System.out.println(" Enter celsiya : ");
//        double cels = scanner.nextInt();
//        System.out.println(cels(cels));
//        System.out.println("-----------------------------------");
//        System.out.println(" Enter Fahrenheit : ");
//        double fahren = scanner.nextInt();
//        System.out.println(faren(fahren));
//        System.out.println("-----------------------------------");
//        for (int i =0; i <=100 ; i++) {
//            System.out.println(i+" C =====> "+cels(i)+" F");
//        }
//        System.out.println("-----------------------------------");
//        System.out.println("Table Fohrengeit");
//
//        System.out.println("-----------------------------------");
//        for (int i = 32; i <=212 ; i++) {
//            System.out.println(i+" F =======> "+faren(i)+" C");
//        }
//        System.out.println("Enter number :");
      int num = scanner.nextInt();
       System.out.println(six(num));
//        System.out.println("-----------------------------------");
        System.out.println("Task7");
        System.out.println("enter a number : ");
        int scanCount = scanner.nextInt();
        System.out.println(tripleCallByValueTask7A(scanCount));
        int count = 2;
        System.out.println(tripleByReferenceTask7B(count));

    }

    public static double one(double a, double b, double s) {
        s = ((0.5) * a * b);


        return s;


    }

    public static double oneGipotenuza(double a, double b, double g) {
        g = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return g;
    }


    public static double two(double r, double h, double s) {
        s = 2 * pi * r * r;
        return s;
    }

    public static double twoVolume(double r, double h, double s, double v) {

        v = s * h;
        return v;
    }

    public static double three(double kursRub, double kolSom) {

        double kolRub;

        kolRub = (kolSom / kursRub);

        return kolRub;


    }

    public static double threeKolDol(double kursDol, double kolSom) {
        double kolDol;

        kolDol = kursDol / kolSom;
        return kolDol;
    }

    public static int four(int hours, int minutes, int seconds) {
        while (hours >= 12)
            hours -= 12;
        int sum = hours * 3600 + minutes * 60 + seconds;
        return sum;
    }

    public static double cels(double t) {
        double s = (t * 1.800) + 32;

        return s;
    }

    public static double faren(double t) {
        double s = 5 * (t - 32) / 9;

        return s;
    }

    public static String six(int a) {
        String sum = "4";

        if (a >= 90 && a <= 100) {
            sum = "5";
        } else if (a >= 80 && a <= 89) {
            sum = "4";

        } else if (a >= 70 && a <= 79) {
            sum = "2";
        } else if (a >= 60 && a <= 69) {
            sum = "1";
        } else if (a >= 0 && a < 60) {
            sum = "0";
        } else {
            sum = "ERROR ";
            System.out.println("ENTER numbers from 0 until 100 ");

        }
        return sum;
    }

    static int tripleCallByValueTask7A(int count) {
        return count * count * count;
    }

    static int tripleByReferenceTask7B(int count) {
        return count * count * count;
    }
}
