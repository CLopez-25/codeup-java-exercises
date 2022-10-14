import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

    }

    public static void addition(int x, int y){
        System.out.println( x + y);
    }

    public static void subtraction(int x, int y){
        System.out.println( x - y);
    }

    public static void multiplication(int x, int y){
        System.out.println( x * y);
    }

    public static void division(int x, int y){
        System.out.println( x / y);
    }

    public static void modulus(int x, int y){
        System.out.println( x % y);
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10:");
        int userInput = in.nextInt();
        if (userInput > max || userInput < min){
            return getInteger(min, max);
        }
    }

}
