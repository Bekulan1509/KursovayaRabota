package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        System.out.println("please enter two names!");

        Scanner scanner1 = new Scanner(System.in);



        String name1 = scanner1.nextLine();
        String name2 = scanner1.nextLine();


        Random random = new Random();
        int ranNum = random.nextInt(100);


        if (name1.equals("Bekulan") && name2.equals("Tahmina")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        } else if (name1.equals("bekulan") && name2.equals("tahmina")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        } else if (name1.equals("tahmina") && name2.equals("bekulan")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        } else if (name1.equals("Tahmina") && name2.equals("Bekulan")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        }
        else if (name1.equals("тахмина") && name2.equals("бекулан")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        }
        else if (name1.equals("Тахмина") && name2.equals("Бекулан")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        }
        else if (name1.equals("бекулан") && name2.equals("тахмина")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        }
        else if (name1.equals("Бекулан") && name2.equals("Тахмина")) {
            System.out.println("your compatibility 100%"); // your compatibility - ваша совместимость
            System.out.println("You will be a good pair \uD83D\uDC4D!!!");
        }
       else if (name1.equals("") || name2.equals("")) {
            System.out.println("please enter  name else");
        } else {
            System.out.println("ваша совместимость " + ranNum + "%"); // your compatibility - ваша совместимост
        }
       if (ranNum > 50) {
            System.out.println("Вы будете хорошей парой \uD83D\uDC4D!!!");//You will be a good pair - Вы будете хорошей парой
        }


    }
}
