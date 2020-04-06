package com.company;

public class Worker implements Comparable<Worker> {
    private String name;
    private String pos;
    private int year;

    public Worker(String name, String pos, int year) {
        this.name = name;
        this.pos = pos;
        this.year = year;
    }

    public Worker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Worker o) {
        if (this.year>o.getYear()){
            return 1;
        }else if (this.year<o.getYear()){
            return -1;
        }else
            return 0;

    }

}
