package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");

        Dog c1 = new Dog();
        c1.setBreed("ov4arka");
        c1.setColor(Color.BLACK);
        c1.setName("Bakyt");
        c1.setShelter(new Shelter("toktogula ", "Geektech"));
        c1.makeVoice();
        c1.setCommands(new String[]{"lie down"});
        System.out.println(c1.getInfo());
        System.out.println("------------------------------------------------------------------");



        Dog c2 = new Dog("SuperDog", "alabai", Color.GRAY, new Shelter("kol", "Geek"));
         c2.makeVoice();
        System.out.println("gav-gav");
        System.out.println(c2.getInfo());
        System.out.println("------------------------------------------------------------------");


        Dog c3 = new Dog("SuperPet", "haski", Color.BROWN, new Shelter("Tor", "Tech"), new String[]{"sit down"});
         c3.makeVoice("grrr",5);
        System.out.println(c3.getInfo());
        System.out.println("------------------------------------------------------------------");




    }
}


