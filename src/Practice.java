package com.codeup.java;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static int subtractTen(int number){
        return number - 10;
    }

    public static double average(int[] numbers){
        double total = 0;
        for(double number : numbers){
            total += number;
        }
        return total/numbers.length;
    }

    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){
        ArrayList<Integer> newNumbersArrayList = new ArrayList<>();
        for (int number : numbers){
            newNumbersArrayList.add(number * multiplier);
        }
        return  newNumbersArrayList;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(20));
        int[] numbers = {5, 10, 15};
        System.out.println(average(numbers));
        for (int number : multiplyAll(5, new ArrayList<>(List.of(5, 10, 15, 25, 30)))){
            System.out.println(number);
        }
    }
}
