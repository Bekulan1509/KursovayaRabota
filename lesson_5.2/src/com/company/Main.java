package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

Producer producer = new Producer(store);
producer.start();
Consumer consumer = new Consumer(store);
consumer.start();



    }
}
