package com.company;

public class Animals implements Comparable<Animals> {
    private String name;
    private String group;
    private String habitat;
    private long PopulationSize;

    public Animals(String name, String group, String habitat, long populationSize) {
        this.name = name;
        this.group = group;
        this.habitat = habitat;
        PopulationSize = populationSize;
    }

    public Animals(String name, String group, String habitat, int[] arrs) {

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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public long getPopulationSize() {
        return PopulationSize;
    }

    public void setPopulationSize(int populationSize) {
        PopulationSize = populationSize;
    }





    @Override
    public int compareTo(Animals o) {
        int sort = this.name.compareTo(o.getName());
        return sort;
    }
}
