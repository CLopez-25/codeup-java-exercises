package com.codeup.java;

import com.codeup.java.RPG.Monster;

import java.util.ArrayList;

public class ArrayListsLecture {
    public static void main(String[] args) {
        // created empty array list
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        // Comparison to how we create plain arrays
        Monster[] monstersArray = new Monster[5];


        // Create monster objects
        Monster orc = new Monster(13, 15, 9, "Orc");
        Monster ogre = new Monster(11, 59, 13, "Ogre");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf");


    }
}


// armorclass, hitpoints, etc are all properties of the monster OBJECT.
// if you have an array that isnt gonna change just let it be an array, if its an array that will change/ make it an arraylist.
// jason's examples= 50 states wont change, if youre working for wayze the number of locations isnt gonna change so no need to use and array list.

// use for loop in grocery list exercise per javier
// you can have an arraylist of an arraylist
// double colon gives you a reference to a method
// DATA STRUCTURE = COLLECTIONS
//