package com.codeup.java;

import com.codeup.java.RPG.Monster;

import java.util.ArrayList;
import java.util.List;

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

        // Add objects to an arrayList one at a time with .add()
        monsterArrayList.add(orc);

        // Get the size of the arrayList using .size()
        // Arrays use .length, arrayLists use .size()
//        System.out.println(monsterArrayList.size());

        // access the elements of the arrayList using .get() with the index
//        System.out.println(monsterArrayList.get(0));

        // ArrayLists have flexible size.  You can keep adding to them
        // after they are created.  Unlike arrays, which have fixed size.
        monsterArrayList.add(ogre);
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.get(1).getArmorClass());
//        System.out.println(monsterArrayList);

        // How to add multiple objects to an arrayList all at once
        ArrayList<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
//        System.out.println(newMonsterList);
//        System.out.println(newMonsterList.get(1));
//        System.out.println(newMonsterList.get(1).getHitPoints());


        // we can add all the elements of one arrayList into another arrayList
        // using the .addAll method
//        monsterArrayList.addAll(newMonsterList);


        // If I want to add a bunch of stuff to an existing arrayList all at once
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));
//        System.out.println(monsterArrayList);
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