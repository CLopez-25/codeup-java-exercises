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
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next();
//        System.out.printf("%s%n%s%n%s%n", userWord, userWordTwo, userWordThree);
//        System.out.println("Enter a sentence:");
//        scanner.nextLine();
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence was %s.%n", userSentence);
//        scanner.nextLine();
//        System.out.println("Enter the length and width of your classroom:");

//        int length = scanner.nextInt();
//        int width = scanner.nextInt();
//        int area = length*width;
//        System.out.printf("The area of your room is %d", area);
        System.out.println("Enter the length of your classroom:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of your classroom");
        int width = Integer.parseInt(scanner.nextLine());
//        int perimeter = Integer.parseInt(length) * 2 + Integer.parseInt(width) * 2;
        int perimeter = width * 2 + length * 2;
        System.out.printf("The perimeter of your classroom is %d%n", perimeter);

    }
}
