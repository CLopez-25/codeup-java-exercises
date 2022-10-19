package com.codeup.java;

import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"happy", "sad", "honest", "smart", "angry", "witty", "brave", "weird", "lovely", "dumb"};
    private static String[] nouns = {"ice", "bed", "rain", "car", "oil", "zoo", "dog", "boy", "cat", "pizza"};


    public static String randomElement(String[] stringArray){
        Random random = new Random();
        int ranIndexOfArray = random.nextInt(stringArray.length);
        return stringArray[ranIndexOfArray];
    }


    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n %s-%s",randomElement(adjectives), randomElement(nouns));
    }
}
