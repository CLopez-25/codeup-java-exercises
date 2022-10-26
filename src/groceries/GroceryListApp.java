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
                "fruits",
                "vegetables",
                "drinks",
                "snacks",
                "desserts",
                "grains",
                "canned foods",
                "frozen foods"
        ));
        Collections.sort(categories);
        return categories;
    }

    public static void enterItem(Input input, ArrayList<String> categories){
        System.out.print("Choose a category: ");
//                starting traditional forLoop for the categories:
        for (int i = 0; i < categories.size(); i++){
            if (i == categories.size() -1){
                System.out.printf("or %s.%n", categories.get(i));
            } else {
                System.out.printf("%s, ", categories.get(i));
            }
        } // end of loop over categories list
    } // end of enterItem method

    public static void generateGroceryList(Input input){
//            reference to the arraylist once every time an item gets added:
        ArrayList<String> categories = generateCategories();
        boolean userWantsToEnterNewItem = input.yesNo("Would you like to enter a new item?");
        if (userWantsToEnterNewItem){
            enterItem(input, categories);
        } // end of if (userWantsToEnterNewItem)
    } // end of generateGroceryList method

    public static void main(String[] args) {
//        beginning of prompts for the user using our overloaded boolean yesNo with a prompt
        Input input = new Input();
        boolean userChoice = input.yesNo("Would you like to create a grocery list? (yes/no)");
        if (userChoice){
            generateGroceryList(input);
        } // end of if(userChoice)
    } // end of main method
} // end of groceryList app
