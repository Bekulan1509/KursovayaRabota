package com.company;

public class Producer extends Thread{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }



    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            try {
                store.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
