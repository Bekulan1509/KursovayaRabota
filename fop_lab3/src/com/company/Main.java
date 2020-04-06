package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

//        System.out.println("\tTask 1: ");
//        task1();
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 2: ");
//
        System.out.println("---------------------------------");
        System.out.println( "Наибольшая сумма в строке: "+ task3());

//        System.out.println("---------------------------------");
        // System.out.println("\tTask 4: ");
        //task4();
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 5: ");
//         task5();
//        System.out.println("---------------------------------");
//        System.out.println("\tTask 6: ");
//         task6();
//        System.out.println("---------------------------------");
        System.out.println("\tTask 7: ");
        task7();

    }


    static void task1() {
//        Дан одномерный массив.Написать функцию, определяющую минимальный,
//        максимальный элементы массива и среднее арифметическое минимального
//        и максимального элементов.Кроме того, программа должна иметь функцию ввода
//        одномерного массива и функцию вывода.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter quantity of the array:");
        int scanNum = scanner.nextInt();
        int number[] = new int[scanNum];

        for (int i = 0; i < scanNum; i++) {
            number[i] = random.nextInt(10);
        }
        System.out.println("The array : " + (Arrays.toString(number)));
        System.out.println();
        Arrays.sort(number);
        System.out.println("Minimum value : " + number[0]);
        System.out.println("Maximum value : " + number[number.length - 1]);
        int average = (number[number.length - 1] + number[0]) / 2;
        System.out.println("average value : " + average);

    }

    static void task2(int value1, int quantity, int quantity2, int d, int[][] c) {
//        Написать функцию перемножения матриц А размером nхm и В размером mхl.
////                Элементы результирующей матрицы получить с помощью
////        следующей формулы.Массивы должны быть динамическими.

        for (int i = 0; i < value1; i++) {
            for (int j = 0; j < quantity2; j++) {
                c[i][j] = 0;

            }
        }
    }

    static int task3 (){
        Random random = new Random(20);
        System.out.println("\tTask 3: ");
        int n = 6, m = 6;
        int[][] arr = new int [n][m];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = random.nextInt(20);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0, max = 0;
        for (int i = 0; i < 6; i++) {
            sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;
            }

        }
        return max;
    }
    static void task4() {
//        Дана действительная матрица размера 6х9.
//        Найти среднее арифметическое наибольшего и наименьшего значений ее элементов.
//         Программа должна быть составлена с использованием функций.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter quantity of the array:");
        int a = scanner.nextInt();
        System.out.println("Enter quantity of the array:");
        int b = scanner.nextInt();
        int array[][] = new int[a][b];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(10) - 5;

            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        double average = (min + max) / 2;
        System.out.println("Maximum Value : " + max);
        System.out.println("Minimum Value : " + min);
        System.out.println("average value : " + average);
    }

    static void task5() {
//        В квадратной матрице размера mxn найти значение наибольшего
//        по модулю элемента матрицы, а также определить индексы этого элемента.
//        Предполагается, что такой элемент - единственный.
//        Программа должна быть составлена с использованием функций.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter quantity of the array:");
        int a = scanner.nextInt();
        int array[][] = new int[a][a];
        int index1 = 0;
        int index2 = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" [ " + array[i][j] + " ] ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (array[i][j] > maximum) {
                    maximum = array[i][j];
                    index1 = j;
                    index2 = i;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum value : " + maximum);
        System.out.println("[ " + index1 + " ] [ " + index2 + " ] ");
    }

    static void task6() {
        //   В данной действительной квадратной матрице порядка N найти сумму элементов строки,
        //   в которой расположен элемент с наименьшим значением. Предполагается, что такой элемент единственный.
        //   Программа должна быть составлена с использованием функций.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of the array:");
        int sum = 0;
        int a = scanner.nextInt();
        Random random = new Random();
        int array[][] = new int[a][a];
        int minimum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = random.nextInt(10) - 3;
                if (minimum > array[i][j]) {
                    minimum = array[i][j];
                    index = i;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" [ " + array[i][j] + " ] ");
            }
            System.out.println();
        }

        for (int i = index; i <= index; i++) {
            for (int j = 0; j < a; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(" The row with minimal value : " + index);
        System.out.println("Suma : " + sum);

    }

    static void task7() {
//        В одномерном массиве, состоящем из n вещественных чисел, вычислить:
//        а) количество элементов массива, меньших С;
//        б) сумму положительных элементов, расположенных после первого положительного элемента.
//        Преобразовать массив таким образом, чтобы сначала располагались все элементы,
//        целая часть которых лежит в интервале [a, b], а потом – все остальные.
//        Программа должна быть составлена с использованием функций.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = scanner.nextInt();
        System.out.println("Enter c :");
        int c = scanner.nextInt();
        int q = 0;
        int[] arr2 = new int[n];
        Random random = new Random();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
            if (arr[i] < c) {
                q++;
            }
        }
        System.out.println();
        System.out.println("Enter a :");
        int a = scanner.nextInt();
        System.out.println("Enter b :");
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (a <= arr[i] && b >= arr[i]) {
                arr2[i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (!(a <= arr[i] && b >= arr[i])) {
                arr2[i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Kol chisel menshih c " + q);

//        int array[] = new int[n];
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(19);
//        }
//        System.out.print("Array : " + Arrays.toString(array));
//        System.out.println();
//        System.out.println();
//        System.out.println("from a until b : ");
//        for (int i = 0; i < n; i++) {
//            if (a <= array[i] && b >= array[i]) {
//            }
//        }
//        System.out.print(Arrays.toString(array));
//
//        for (int i = 0; i < n; i++) {
//            if (c < array[i]) {
//
//            }
//            System.out.println();
//            System.out.println("Numbers until C : ");
//            System.out.println(Arrays.toString(array));
//
//
//        }
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("The numbers that aren't in a till b : ");
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            if (!(a <= array[i] && b >= array[i])) {
//            }
//        }
//        System.out.print(Arrays.toString(array));
//        System.out.println();
    }

}
