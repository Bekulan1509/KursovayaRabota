package com.company;

import java.io.*;
import java.util.*;


public class Main {
    private static String[] name;
    private static String name1 = "Джейран";
    private static String name2 = "Гну";
    private static String name3 = "Бейза";
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Animals> data;

    public static void main(String[] args) {

        try {

            File file = new File("kursovayaRabotaFOP.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);
            writer.println("Название;   Группа;   Место обитания;   Численность популяции");
            writer.println("Джейран;     A;          Азия;            30000;");
            writer.println("Гну;         B;          Африка;          560000;");
            writer.println("Бейза;       H;          Африка;           2500;");
            writer.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("kursovayaRabotaFOP.txt"));


            data = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                name = line.split(";");

                data.add(new Animals(name[0], name[1], name[2], name[3]));
                for (int i = 0; i < name.length; i++) {
                    System.out.print(name[i]);
                }
                System.out.println();
            }
            bufferedReader.close();


            System.out.println("__________________________________________________________________________");
            System.out.println("After sort : ");
            System.out.println();
            data.sort(Animals::compareTo);
            data.removeIf(n -> (n.getName().equals("Название")) || n.getGroup().equals("Группа"));
            data.add(0, new Animals("Название ", "Группа ", " Место обитания", " Численность популяции"));

            Iterator<Animals> iter = data.iterator();
            while (iter.hasNext()) {
                Animals animals = iter.next();
                System.out.println(animals.getName() + " " + animals.getGroup() + " " + animals.getHabitat() + " " + animals.getPopulationSize());
            }
            System.out.println("__________________________________________________________________________");

            System.out.println("SEARCH :");
            search2();

        } catch (IOException e) {
            System.err.println("ERROR" + e);
        }
        System.out.println("__________________________________________________________________________");

        System.out.println("__________________________________________________________________________");

        try {
            toWriteFile();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    static void search2() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("kursovayaRabotaFOP.txt"));
        String line;
        try {
            String searchName =scanner.next();
            while ((line = bufferedReader.readLine()) != null) {
                name = line.split(";");

                for (int i = 0; i <name.length ; i++) {
                   if (name[i].equals(searchName)){
                       System.out.print(name[i]+" is available ");
                   }

                }
                System.out.println();
        }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }




        }

    static void search() {
        System.out.println("SEARCH : ");
        System.out.println(" unless you would like to find on more  ENTER - no:");
        System.out.println("Enter a name,  that  you would like to find :");

        boolean checkFlag = true;

        while (checkFlag) {
            String searchName = scanner.nextLine();

            if (searchName.equals(name1)) {
                System.out.println("Джейран;    \tA;  \t\t\tАзия;    \t\t30000;");
            } else if (searchName.equals(name2)) {
                System.out.println("Гну;        \tB;  \t\t\tАфрика;  \t\t560000;");
            } else if (searchName.equals(name3)) {
                System.out.println("Бейза;      \tH;  \t\t\tАфрика;  \t\t2500;");
            } else if (searchName.equals("no")) {
                checkFlag = false;
            } else
                System.err.println("the name, that you entered , it doesn't exist in the table");

        }

    }


    static void toWriteFile() throws IOException {
        File file = new File("kursovayaRabot.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter writer = new PrintWriter(file);
        Iterator<Animals> iterator = data.iterator();
        while (iterator.hasNext()) {
            Animals animals = iterator.next();
            writer.println(animals.getName() + " " + animals.getGroup() + " " + animals.getHabitat() + " " + animals.getPopulationSize());
        }
        writer.close();

    }


}
