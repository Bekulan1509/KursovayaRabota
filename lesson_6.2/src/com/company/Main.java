package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> l = new Box<>(12.5,20);
        Box<Float, Float> l1 = new Box<>(11.3F,11.5F);
        addition(l,l1);
        multiplication(l,l1);
    }
    public  static void addition(Box<?extends Number,? extends Number>box1,Box<?extends Number,? extends Number>box2){
        System.out.println(box1.getNumber1().doubleValue() + box1.getNumber2().doubleValue()+box2.getNumber1().doubleValue()+box2.getNumber2().doubleValue());
    }
    public static void multiplication(Box<?extends Number,?extends Number>box3,Box<?extends Number,?extends Number>box4){
        System.out.println(box3.getNumber1().doubleValue() * box3.getNumber2().doubleValue()*box4.getNumber1().doubleValue()*box4.getNumber2().doubleValue());


    }

}
