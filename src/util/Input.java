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

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userChoice = this.scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d\n", min, max);
        int userNumber = scanner.nextInt();
        if ((userNumber > max) && (userNumber < min)) {
            System.out.println("Try again!");
            return getInt(min, max);
        } else {
            System.out.printf("Your number was %d!%n", userNumber);
            return scanner.nextInt();
        }
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

//    public double getDouble(double min, double max) {
//        double userNumber = scanner.nextInt();
//        if ((userNumber > max) && (userNumber < min)) {
//            System.out.println("Try again!");
//            return getInt(double min, double max);
//        } else {
//            System.out.printf("Your number was %f!%n", userNumber);
//            return scanner.nextDouble();
//        }
//    }



    public Input(){
        scanner = new Scanner(System.in);
    }
}
