package com.codeup.java.vehicle;

public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise(){
        return "vroom vroom";
    }

    public void alarm(){
        System.out.println("weeewuuu");
    }

    public Vehicle(){}

    public Vehicle(String name){
        this.name = name;
    }
}
