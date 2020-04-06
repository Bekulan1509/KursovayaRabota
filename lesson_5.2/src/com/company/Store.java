package com.company;

public class Store {
    private int products;


    public synchronized void produce() throws InterruptedException {
        products++;
        while (products > 3) {
            wait();
        }


        System.out.println("a producer made a product");
        System.out.println("there is " + products + " in the store");
        notify();
    }

    public synchronized void buy() throws InterruptedException {
        while (products <= 0) {
            wait();
        }
        products--;
        System.out.println("a Consumer bought a product");
        System.out.println("there is " + products + " in the store");
    }

}
