package com.codeup.java;//import java.util.Scanner;

import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
//        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("will this be on a separate line");
//        System.out.printf("The number is %11.2f%n", someNumber); // 11.2 is the total amount of leading zeros, numbers including the decimal point, the # after the decimal point is how many integers you want to output after it.
//        System.out.printf("The number is %-11.2f%n", someNumber); // -11.2 will take away the number of spaces before the number starts to output.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
//        int userNumber = Integer.parseInt(scanner.nextLine());
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d", userNumber);
        System.out.println("Enter a sentence:");
//        String ghost = scanner.nextLine();
        scanner.nextLine();
        String userInput = scanner.nextLine();
        System.out.printf("Your sentence was %s.%n", userInput);
        System.out.println("Enter another sentence:");
        String secondSentence = scanner.nextLine();
        System.out.printf("Your second sentence was %s.%n", secondSentence);
    }
}
