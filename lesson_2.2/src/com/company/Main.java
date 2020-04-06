package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.perimeter();
        System.out.println(c1.getInfo() + " " + c1.perimeter());

        Triangle triangle = new Triangle(6, 7, 10);
        System.out.println(triangle.peremiter() + " " + triangle.getInfo());


        Square square = new Square(5);
        System.out.println(square.getInfo() + " " + square.perimeter());

        Rectangle rectangle = new Rectangle(6, 7);
        System.out.println(rectangle.name() + " " + rectangle.perimeter());

        Square square2 = new Square(6);
        System.out.println(square2.getInfo() + " " + square2.perimeter());

        Triangle triangle2 = new Triangle(9, 8, 11);
        System.out.println(triangle2.peremiter() + " " + triangle2.getInfo());


        Figure[] figures = new Figure[]{c1, triangle, square, rectangle, square2, triangle2};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getInfo() + " " + figures[i].perimeter() + " " + figures[i].draw());

        }

        Dog dog = new Dog();
        dog.getGetName();
        dog.draw();
        dog.SoundProducible();

        System.out.println(dog.getGetName());


    }


}
