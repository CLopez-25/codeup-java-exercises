package com.codeup.java;

import java.util.ArrayList;
import java.util.List;

public class PetDogTest {
    public static void main(String[] args) {
        PetDog petDog = new PetDog("Grinch", "Cavalier King Charles", true);
        PetDog petDog1 = new PetDog("Daisy", "English Mastiff", true);
        PetDog petDog2 = new PetDog("Rex", "Pit Bull", true);

        ArrayList<PetDog> petDogs = new ArrayList<>(List.of(petDog, petDog1, petDog2));
        System.out.println(petDog.snuggle());
        PetDog.allSnuggle(petDogs);

    }
}
