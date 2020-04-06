package com.company;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getInfo() {
        return "Triangle";
    }

    @Override
    public String draw() {
        return "△";
    }

    public double peremiter() {
        return a + b + c;
    }

}
