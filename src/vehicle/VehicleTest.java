package com.codeup.java.vehicle;

    public class VehicleTest {
        public static void main(String[] args) {
            Vehicle genericCar = new Vehicle();
            System.out.println(genericCar.makeNoise());
            Motorcycle ducati = new Motorcycle();
            System.out.println(ducati.makeNoise());
            ducati.breakDown();
        }
    }
