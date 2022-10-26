package com.codeup.java.groceries;

import com.codeup.java.util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryListApp {
    //        method to generate an array list of grocery categories and sorting them using Collections.sort:
    public static ArrayList<String> generateCategories(){
        ArrayList<String> categories = new ArrayList<>(List.of(
                "dairy",
                "meat",
                "fish",
                "fruit",
                "vegetable",
                "drinks",
                "snacks",
                "desert",
                "grain",
                "canned",
                "frozen"
        ));
        Collections.sort(categories);
        return categories;
    }
    public static void main(String[] args) {
//        beginning of prompts for the user using our overloaded boolean yesNo with a prompt

        Input input = new Input();
        boolean userChoice = input.yesNo("Would you like to create a grocery list? (yes/no)");
        if (userChoice){
            boolean userWantsToEnterNewItem = input.yesNo("Would you like to enter a new item?");
            if (userWantsToEnterNewItem){
                System.out.println("logic for entering a new item");
            }
        }
    }
}
