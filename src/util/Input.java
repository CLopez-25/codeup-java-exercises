package com.codeup.java.util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userChoice = this.scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.trim().equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s:%n", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            return getInt(min,max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        double userNumber = this.scanner.nextDouble();
        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.printf("Your number was %d!%n", userNumber);
            return userNumber;
        }
    }



    public Input(){
        scanner = new Scanner(System.in);
    }


}
