package com.codeup.java.groceries;

import com.codeup.java.util.Input;

public class GroceryListApp {
    public static void main(String[] args) {
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
