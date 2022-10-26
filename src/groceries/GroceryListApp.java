package com.codeup.java.groceries;

import com.codeup.java.util.Input;

import java.util.*;

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

    public static void enterItem(Input input, ArrayList<String> categories, HashMap<String, ArrayList<GroceryItem>> groceryList){
        System.out.print("List of categories: ");
//                starting traditional forLoop for the categories:
        for (int i = 0; i < categories.size(); i++){
            if (i == categories.size() -1){
                System.out.printf("or %s.%n", categories.get(i));
            } else {
                System.out.printf("%s, ", categories.get(i));
            }
        } // end of loop to output categories list
        String category = input.getString("Enter a category:");
        String name = input.getString("Enter the name of the item:");
        String quantity = input.getString("Enter the quantity:");
        System.out.printf("You entered: category: %s; item %s; quantity: %s%n", category, name, quantity);
        boolean entryWasCorrect = input.yesNo("Is this correct? (yes/no)");
        if (entryWasCorrect){
            GroceryItem groceryItem = new GroceryItem(name, quantity, category);
//            if the user inputs "no" then this will finalize the list and run this:
            if (!groceryList.containsKey(category)){
                groceryList.put(category, new ArrayList<GroceryItem>());
                groceryList.get(category).add(groceryItem);
            } else{
                groceryList.get(category).add(groceryItem);
            }
        } else {
            enterItem(input, categories, groceryList);
        }
    } // end of enterItem method

    public static void generateGroceryList(Input input, ArrayList<String> categories,HashMap<String, ArrayList<GroceryItem>> groceryList){
        boolean userWantsToEnterNewItem = input.yesNo("Would you like to enter a new item? (yes/no)");
//        if the user input is yes then it will ask for the item name category and quantity then output the updated list
        if (userWantsToEnterNewItem){
            enterItem(input, categories, groceryList);
            generateGroceryList(input, categories, groceryList);
        } else {
            System.out.println("Here is your list:");
            Map<String, ArrayList<GroceryItem>> groceryListWithCategoriesAlphabetized = new TreeMap<>(groceryList);
            groceryListWithCategoriesAlphabetized.forEach((category, arrayListOfItems) -> {
                arrayListOfItems.sort(Comparator.comparing(GroceryItem :: getName));
                System.out.printf("Category: %s%n", category);
                for (GroceryItem groceryItem : arrayListOfItems){
                    System.out.printf("%s, %s%n", groceryItem.getName(), groceryItem.getQuantity());
                }
            });
        } // end of if (userWantsToEnterNewItem) else{}
    } // end of generateGroceryList method

    public static void main(String[] args) {
//        beginning of prompts for the user using our overloaded boolean yesNo with a prompt
        Input input = new Input();
        boolean userChoice = input.yesNo("Would you like to create a grocery list? (yes/no)");
//          generating the arraylist once every time an item gets added:
        ArrayList<String> categories = generateCategories();
        HashMap<String, ArrayList<GroceryItem>> groceryList = new HashMap<>();
        if (userChoice){
            generateGroceryList(input, categories, groceryList);
        } // end of if(userChoice)
    } // end of main method
} // end of groceryList app
