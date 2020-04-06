package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("big", new String[]{"enormouse", "large", "gigant", "krupnyi"});

        dictionary.put("human", new String[]{"person", "gomosopiens", "individum", "people"});

        dictionary.put("beauty", new String[]{"beautiful", "pretty", "wonderful", "sympotnyi", "sport"});

        dictionary.put("house", new String[]{"hata", "lair", "apartment", "flat", "home", "castle", "village"});

        System.out.println("Please enter the sentences from the dictionary, example house");

        Scanner scanner = new Scanner(System.in);
        String sentences = scanner.nextLine().toLowerCase();
        String[] words = sentences.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            String[] synonyms = dictionary.get(words[i]);
            if (synonyms != null) {
                Random r = new Random();
                int randIndex = r.nextInt(synonyms.length);
                System.out.print(synonyms[randIndex]+" ");
            } else
                System.out.println("the word wasn't found!");

        }

    }

}
