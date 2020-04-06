package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age : ");
        String age = scanner.nextLine();
        System.out.println("Please enter the company where you work : ");
        String company = scanner.nextLine();



        try {
            File paricipantFile = new File("participantFile.txt");
            if (!paricipantFile.exists())
            paricipantFile.createNewFile();
            PrintWriter printWriter = new PrintWriter(paricipantFile);

            printWriter.println("Last name: "+lastName);
            printWriter.println("Age: "+age);
           printWriter.println("Company: "+company);

            printWriter.close();
        }catch (IOException e){
            System.out.println("Error"+e);
        }







    }
}
