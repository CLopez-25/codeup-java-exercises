package com.codeup.java;

public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " +this.name+ "!");
    }

    public Person(String name){
        this.name = name;
    }
    public Person(){}


    public static void main(String[] args) {
        Person person1 = new Person("Cesar");
        System.out.println(person1.getName());
        person1.sayHello();
    }
}
