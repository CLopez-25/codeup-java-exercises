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

//        Person person2 = new Person("John");
//        Person person3 = new Person("John");
//        System.out.println(person2.getName().equals(person3.getName()));
//        System.out.println(person2 == person3);
//        Person person2 = new Person("John");
//        Person person3 = person2;
//        System.out.println(person2 == person3);

        Person person2 = new Person("John");
        Person person3 = person2;
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        person3.setName("Jane");
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}
