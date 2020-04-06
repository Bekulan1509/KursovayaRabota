package com.company;

public class Rectangle extends Figure {
    private  double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public String name(){
        return "Rectangle";
    }
    public double perimeter(){
        return (2*a)+(2*b);
    }

    @Override
    public String getInfo() {
        return "Rectangle";
    }

    @Override
    public String draw() {
        return "⬜";
    }
}
