package com.company;

public class Circle extends Figure {

    private double r;

    public Circle(int r) {
        this.r = r;
    }


    public void Circle(double r) {
        this.r = r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;


    }



    @Override
    public String getInfo() {
        return "Circle";
    }

    @Override
    public String draw() {
        return "\u25CF";
    }
}
