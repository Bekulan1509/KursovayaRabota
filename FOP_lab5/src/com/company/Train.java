package com.company;

public class Train implements Comparable<Train> {

    private String nazn;
    private int num;
    private String time;

    public Train(String nazn, int num, String time) {
        this.nazn = nazn;
        this.num = num;
        this.time = time;
    }

    public String getNazn() {
        return nazn;
    }

    public void setNazn(String nazn) {
        this.nazn = nazn;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int compareTo(Train o) {
        if (this.num > o.getNum()) {
            return 1;
        } else if (this.num < o.getNum()) {
            return -1;
        } else
            return 0;
    }
}
