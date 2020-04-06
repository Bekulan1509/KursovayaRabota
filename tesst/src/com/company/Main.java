package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RuntimeException {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "'s " + "bank amount is");
        System.out.println("your balance is " + bankAccount.deposit(10000));
        System.out.println("Would you like to earn some money?");
        System.out.println("1 - yes, 2- No ");
        int num = scanner.nextInt();


        if (num == 1) {
            System.out.println("\n 1 example ");
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            System.out.println(" How much will it be " + a + " * " + b + "?");
            double sum = a * b;
            double answer = scanner.nextDouble();
            if (answer == sum) {
                System.out.println("My congratulations ! It's correct!");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));
            }

            else {
                System.out.println("It isn't correct! You are Looser!  Right answer is " + sum);

            }
        }
        System.out.println(" \n 2 example ");
        int a1 = (int) (Math.random() * 10);
        int b1 = (int) (Math.random() * 10);
        int c1 = (int) (Math.random() * 10);
        System.out.println(" How much will it be " + a1 + " - " + b1 + " + " + c1 + "?");

        double sum1 = a1 - b1 + c1;
        double answer1 = scanner.nextDouble();
        if (answer1 == sum1) {
            System.out.println("My congratulations ! It's correct!");
            System.out.println("+100 soms  for the right answer ");
            System.out.println("Your balance: " + bankAccount.deposit(100));
        } else {
            System.out.println("It isn't correct! You are Looser!   Right answer is " + sum1);
        }
        System.out.println("\n 3 example ");
        int a2 = (int) (Math.random() * 10);
        int b2 = (int) (Math.random() * 10);
        int c2 = (int) (Math.random() * 10);
        System.out.println(" How much will it be " + a2 + " * " + b2 + " + " + c2 + "?");
        double sum2 = a2 * b2 + c2;
        double answer2 = scanner.nextInt();
        if (answer2 == sum2) {
            System.out.println("My congratulations ! It's correct!, There are 2 else) ");
            System.out.println("+100 soms  for the right answer ");
            System.out.println("Your balance: " + bankAccount.deposit(100));

        } else {
            System.out.println("It isn't correct! You are Looser!   Right answer is " + sum2);
        }
        System.out.println("\n 4 example ");
        int a3 = (int) (Math.random() * 10);
        int b3 = (int) (Math.random() * 10);
        int c3 = (int) (Math.random() * 10);
        System.out.println(" How much will it be " + a3 + " / " + b3 + " + " + c3 + "?");
        double sum3 = a3 / b3 + c3;
        double answer3 = scanner.nextInt();
        if (answer3 == sum3) {
            System.out.println("My congratulations ! It's correct!");
            System.out.println("+100 soms  for the right answer ");
            System.out.println("Your balance: " + bankAccount.deposit(100));

        } else {
            System.out.println("It isn't correct! You are Looser!   Right answer is " + sum3);
        }
        System.out.println("\n 5 example ");
        int a4 = (int) (Math.random() * 10);
        int b4 = (int) (Math.random() * 10);
        int c4 = (int) (Math.random() * 10);
        System.out.println(" How much will it be " + a4 + " + " + b4 + " * " + c4 + "?");
        double sum4 = a4 + b4 * c4;
        double answer4 = scanner.nextInt();
        if (answer4 == sum4) {
            System.out.println("My congratulations ! It's correct!");
            System.out.println("+100 soms  for the right answer ");
            System.out.println("Your balance is : " + bankAccount.deposit(100));
        } else {
            System.out.println("It isn't correct! You are Looser!   Right answer is " + sum4);


        }
        while (true) {
            System.out.println("\n How much would you like to get " + name);
            int money = scanner.nextInt();
            try {
                System.out.println("you got money successfully " + money);
                System.out.println(bankAccount.withDraw(money));

            } catch (LimitException e) {
                System.out.println(e.getMessage());
            } catch (Exception ex) {
                System.out.printf(ex.getMessage());
                break;
            }

            System.out.println("would " + name + " like to put some money?");
            double putMoney = scanner.nextDouble();
            bankAccount.deposit(putMoney);
            System.out.println("your balance is " + bankAccount.getAmount());

        }


        if (num == 2) {
            System.out.println("у вас насчету " + bankAccount.deposit(10000));
            while (true) {
                try {
                    System.out.println("остаток на счету " + bankAccount.withDraw(6000));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Вы успешно сняли деньги " + bankAccount.getAmount() + " сомов со счета");
                    bankAccount.takeMoney();
                    System.out.println(bankAccount.getAmount());
                    break;
                }


            }

        }

    }
}