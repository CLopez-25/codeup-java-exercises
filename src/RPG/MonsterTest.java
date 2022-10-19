package com.codeup.java.RPG;

public class MonsterTest {


    public static void main(String[] args) {
        Monster orc = new Monster(15, 9, 13, "Orc");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster ogre = new Monster(11, 59, 13, "Ogre");

        Monster[] monsters = {orc, blueDragon, ogre};
        for (Monster monster : monsters){
            System.out.println(monster);
        }

    }
}
