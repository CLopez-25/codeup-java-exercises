package com.codeup.java.animals;
import com.codeup.java.Quote;

public class Horse {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sound;
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise(){
        System.out.printf("%s goes %s", name, Quote.randomQuote());
    }
}
