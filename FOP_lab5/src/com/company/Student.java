package com.company;

public class Student implements Comparable<Student>  {
    private String name;
    private String group;
    private int ses;

    public Student(String name, String group, int ses) {
        this.name = name;
        this.group = group;
        this.ses = ses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getSes() {
        return ses;
    }

    public void setSes(int ses) {
        this.ses = ses;
    }



    @Override
    public int compareTo(Student o) {
        int data =  this.name.compareTo(o.getName());
        return data ;
    }


}
