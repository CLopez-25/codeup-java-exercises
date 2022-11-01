package com.codeup.java;

public class Employee {

    public String name;

    public static String company = "Viridian Dynamics";

    public String displayEmployeeInfo(){
        return name + " works at " + company;
    }

    public Employee(){
        System.out.println("We have a new employee!");
    }
}
// when a constructor is called it creates an instance of the class