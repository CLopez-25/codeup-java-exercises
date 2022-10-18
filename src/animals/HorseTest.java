package com.codeup.java.animals;

public class HorseTest {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
//        horse1.name = "Paloma";
//        horse1.sound = "Neeeeeeeigh!";
        horse1.setName("Paloma");
        horse1.setSound("Neeeeeeeigh!");
        horse1.makeNoise();
    }
}
