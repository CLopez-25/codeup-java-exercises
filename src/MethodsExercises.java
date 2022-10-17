import java.util.Scanner;

public class MethodsExercises {


//    public static void addition(int x, int y){
//        System.out.println( x + y);
//    }
//
//    public static void subtraction(int x, int y){
//        System.out.println( x - y);
//    }
//
//    public static void multiplication(int x, int y){
//        System.out.println( x * y);
//    }
//
//    public static double division(double int x, double int y){
//        System.out.println( x / y);
//    }
//
//    public static void modulus(int x, int y){
//        System.out.println( x % y);
//    }
//
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("Enter a number between %d and %d:%n", min, max);
//        int userInput = scanner.nextInt();
//        if (userInput > max || userInput < min){
//            return getInteger(min, max);
//        } else {
//            System.out.println("You got it!");
//            return userInput;
//        }
//    }

    public static int getFactorial() {
        int x, y, fact = 1;

        System.out.printf("Give me a number between %d and %d\n", 1, 10);
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        if (x < 0) {
            System.out.println("Number should be non-negative.");
            return x;
        } else {
            for (y = 1; y <= x; y++)
                fact = fact * y;

            System.out.println("Factorial of " + x + " is = " + fact);
            return x;
        }
    }

    public static int generateRandomNumber(int max){
        return (int) Math.round(Math.random() * max);
    }

    public static void diceRoll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides do the dice have?");
        byte numberOfSides = scanner.nextByte();
        System.out.printf("Your dice have %d sides.%n", numberOfSides);
        System.out.println("Would you like to roll the dice? y/n");
        String userChoice = scanner.next();
        while (userChoice.equals("y")){
                System.out.println("You rolled the dice!");
                System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides), generateRandomNumber(numberOfSides));
                System.out.println("Would like to roll the dice again?");
                userChoice = scanner.next();
            }
        }

    public static void main(String[] args) {
//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(10, 5));
//        System.out.println(multiplication(2, 5));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(20, 3));
//        getInteger(1, 10);
//        getFactorial();
        diceRoll();
    }
} // class end
