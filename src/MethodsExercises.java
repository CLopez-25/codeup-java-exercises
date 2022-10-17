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
//    public static void division(int x, int y){
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

    public static int getFactorial(){
        int x, y, fact = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number from %d and %d: %n", 1, 10);
        x = scanner.nextInt();

        if (x < 0) {
            System.out.println(" the number should not be negative.");
            return x;
        } else {
            for (y = 1; y <= x; y++)
                fact = fact * y;
            System.out.println("The factorial of " + x + " is = " + fact);
            return x;
        }

    }

    public static void main(String[] args) {
//        getInteger(1, 10);
        getFactorial();
    }
}
