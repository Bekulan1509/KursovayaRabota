package com.company;

import java.io.*;
import java.util.*;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Animals> data;
        data = new ArrayList<>();

        String[] name;
        try {

            File file = new File("kursovayaRabotaFOP.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);
            // writer.println("Название;   Группа;   Место обитания;   Численность популяции");
            writer.println("Джейран;     A;          Азия;            30000");
            writer.println("Гну;         B;          Африка;          560000");
            writer.println("Бейза;       H;          Африка;           2500");
            writer.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("kursovayaRabotaFOP.txt"));


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                name = line.split(";");
                int[] arrs = new int[]{((name.length))};
                arrs[0] = Integer.parseInt((name[3].trim()));
                data.add(new Animals(name[0], name[1], name[2], arrs[0]));
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
//            data.removeIf(n -> (n.getName().equals("Название")) || n.getGroup().equals("Группа"));
//            data.add(0, new Animals("Название ", "Группа ", " Место обитания", " Численность популяции"));

            Iterator<Animals> iter = data.iterator();
            while (iter.hasNext()) {
                Animals animals = iter.next();
                System.out.println(animals.getName() + " " + animals.getGroup() + " " + animals.getHabitat() + "        " +
                        "  " + animals.getPopulationSize());

            }
            System.out.println("__________________________________________________________________________");

            System.out.println("SEARCH :");
            search(data);

        } catch (IOException e) {
            System.err.println("ERROR" + e);
        }
        System.out.println("__________________________________________________________________________");

        System.out.println("__________________________________________________________________________");

        try {
            toWriteFile(data);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    static void search(List<Animals> data) {
        System.out.println("Enter an animal :");
        String name = scanner.next();
        for (Animals animals : data) {
            if (animals.getName().contains(name)) {
                System.out.println(name + " ✅");
            }

        }
    }


    static void toWriteFile(List<Animals> data) throws IOException {
        File file = new File("kursovayaRabot.txt");

        if (data.size() > 0) {
            file.delete();
        }
        if (!file.exists()) {
            file.createNewFile();
        } else System.out.println("false");


        if (file.exists()) {
            PrintWriter writer = new PrintWriter(file);
            Iterator<Animals> iterator = data.iterator();
            while (iterator.hasNext()) {
                Animals animals = iterator.next();
                writer.println(animals.getName() + " " + animals.getGroup() + " " + animals.getHabitat() + " " + animals.getPopulationSize());
            }
            writer.close();
        }


    }


}
