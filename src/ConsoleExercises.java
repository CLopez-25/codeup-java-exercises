import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %1.2f.%n", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int userInt = scanner.nextInt();
//        System.out.println("Enter 3 words:");
//        String userWord = scanner.next();
//        System.out.printf("Your word was %s.%n", userWord);
//        String userWordTwo = scanner.next();
//        System.out.printf("Your word was %s.%n", userWordTwo);
//        String userWordThree = scanner.next();
//        System.out.printf("Your word was %s.%n", userWordThree);
//        System.out.println("Enter a sentence:");
//        scanner.nextLine();
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence was %s.%n", userSentence);
//        scanner.nextLine();
        System.out.println("Enter the length and width of your classroom:");

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = length*width;
        System.out.printf("The area of your room is %d", area);
    }
}
