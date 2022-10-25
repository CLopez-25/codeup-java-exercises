package com.codeup.java;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void highLow(){
        Random random = new Random();
        int result = random.nextInt(100);
        System.out.println(result);

        int x =0;
        while (x != result) {
            System.out.println("Pick a number between 1 and 100");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if (x > result){
                System.out.println("Lower");
            } else if (x < result) {
                System.out.println("Higher");
            }
        }         System.out.println("Good Guess");
    }

    public static void main(String[] args){
        highLow();
    }
}
