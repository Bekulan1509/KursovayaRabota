package com.company;

import com.company.Printible;

public class Participant implements Printible {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
