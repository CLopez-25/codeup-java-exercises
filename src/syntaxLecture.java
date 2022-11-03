package com.codeup.java;

public class syntaxLecture {
    public static void main(String[] args) {
        // Declare a variable without initializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier king charles spaniel";
        // initialize and declare all at the same time;
        String name = "Grinch";
        int cutenessFactor = 10;
        // Statement: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        if (cutenessFactor > 8){
            System.out.println(name + " is cute.");
        } else {
            System.out.println(name + " needs to work on cuteness.");
        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; // bytes go from -128 to 127
        short meduimNumber; // shorts go from -32768 to 32767
        int number; // integers go c. -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000000000;
        smallNumber = (byte) number;
        System.out.println(smallNumber);

        bigNumber = 9000000000000L;

        float imafloat = 2.34F;
        double imadouble = 9.0123456789123;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);

        System.out.println((int) Math.pow(2, 3)); // this is for exponents
    }
}

// you lose data when you push past threshold of bytes
// converting on data value to another = casting