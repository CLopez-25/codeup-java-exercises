package com.codeup.java.vehicle;

public class Vehicle {
    public String setName;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("vroom vroom");
    }
}
