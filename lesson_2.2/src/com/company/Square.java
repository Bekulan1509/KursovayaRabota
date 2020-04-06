package com.company;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getInfo() {
        return "Square";
    }

    @Override
    public String draw() {
        return "\u2B1C";
    }

    public double perimeter() {
        return a * 4;
    }
}
