package com.codeup.java.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setName = ("subaru");
        System.out.print(car.getName() + " goes ");
        car.makeNoise();
        Motorcycle ducati = new Motorcycle();
        ducati.makeNoise();
    }
}
