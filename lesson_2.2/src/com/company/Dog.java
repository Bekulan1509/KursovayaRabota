package com.company;

public class Dog extends Animal implements Drawable, SoundProducible {
    private  String getName="the dog is called John";

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");

    }

    @Override
    public void SoundProducible() {
        System.out.println("gav-gav");

    }
}
