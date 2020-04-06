package com.company;

public class Animals implements Comparable<Animals> {
    private String name;
    private String group;
    private String habitat;

    public Animals(String name, String group, String habitat, String populationSize) {
        this.name = name;
        this.group = group;
        this.habitat = habitat;
        PopulationSize = populationSize;
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

    public String getPopulationSize() {
        return PopulationSize;
    }

    public void setPopulationSize(String populationSize) {
        PopulationSize = populationSize;
    }

    private String PopulationSize;



    @Override
    public int compareTo(Animals o) {
        int sort = this.name.compareTo(o.getName());
        return sort;
    }
}
