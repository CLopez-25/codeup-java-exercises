package com.codeup.java.vehicle;

public class Motorcycle extends Vehicle {
    public String makeNoise(){
        return "Zoom";
    }

    public void breakDown(){
        System.out.println(super.makeNoise());
        System.out.println("krrcckkklunnnnk");
    }

    public Motorcycle(){}

    public Motorcycle(String name){
        this.setName(name);
    }

}
