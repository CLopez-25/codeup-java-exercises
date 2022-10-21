package com.codeup.java.animals;

public class Bird {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("caw caw");
    }

    // Polymorphic argument definition:
    public static void birdSounds(Bird[] birdsArray){
        for(Bird bird : birdsArray){
            bird.makeNoise();
        }
    }

    public Bird(){
        System.out.println("A bird has been created");
    }
}
