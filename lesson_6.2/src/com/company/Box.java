package com.company;

public class Box<T extends Number, E extends Number> {
   private  T number1;
   private E number2;

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public E getNumber2() {
        return number2;
    }

    public void setNumber2(E number2) {
        this.number2 = number2;
    }

    public Box(T number1, E number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}
