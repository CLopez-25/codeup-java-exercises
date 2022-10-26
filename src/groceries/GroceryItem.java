package com.codeup.java.groceries;

public class GroceryItem {

    private String name;

//    used String quantity so that the user can enter "one gallon, one pound", etc.
    private String quantity;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GroceryItem() {
    }

    public GroceryItem(String name, String quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

}
