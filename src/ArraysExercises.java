package com.codeup.java;

import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }



    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


        Person[] people = new Person[3];
        people[0] = new Person("Cesar");
        people[1] = new Person("Sky");
        people[2] = new Person("Oliver");
        for (Person person : people){
            System.out.println(person.getName());
        }

//        System.out.println("__________");

        Person Paloma = new Person("Paloma");
        people = addPerson(people, Paloma);
        System.out.println(Paloma.getName());
//        for (Person person : people){
//            System.out.println(person.getName());
//        }

    }
}
