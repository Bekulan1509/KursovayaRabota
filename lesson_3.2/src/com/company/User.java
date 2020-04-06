package com.company;

import java.nio.charset.IllegalCharsetNameException;

public class User {
    private String name;
    private int age;

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) throws IllegalCharsetNameException  {
        if (name.length()>20){
            throw new IllegalCharsetNameException("слишком длинное имя");
        }
        this.name = name;
    }

    public int getAge(int age)  {
        return this.age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0 || age>100){
            throw new IllegalAgeException("Это не возможно");
        }
        this.age = age;
    }

    public User(){

    };
}
