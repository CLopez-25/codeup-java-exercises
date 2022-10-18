package com.codeup.java.animals;

public class Dog {
    public static String bark(){
        return "Woof woof!";
    }

//    public static void bark(){
//        System.out.println("woof woof");
//    }

    public static void bark(int weight){
        if (weight < 25){
            System.out.println("Yip yip");
        } else {
            System.out.println("Woof woof");
        }
    }

    public static void bark(int weight, String name){
        // this code provided by Stephen Pflug
        System.out.printf("%s goes ", name);
        bark(weight);
    }

    public static void main(String[] args) {
//        String bark = bark();
//        System.out.println(bark);
        System.out.println(bark());

//        bark(15);
//        bark(50);
//        bark(50, "Rudo");
//        bark(15, "Fido");
    }
}

// public class means we access this class from anywhere in our project
// static means i dont have to create an object (dog)
// void means it doesnt return anything