import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        String userString = "";
//        while (i <= 15){
//            userString += i+" ";
//            i++;
//        }
//        System.out.println(userString);

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//         long i = 2;
//         do {
//             System.out.println(i);
//             i *= i;
//         } while (i < 1000000);


//         for (i = 5; i < 15; i++){
//             System.out.println(i);
//         }

//         for (int i = 0; i <= 100; i += 2){
//             System.out.println(i);
//         }

//         for (int i = 100; i >= -10; i -= 5){
//             System.out.println(i);
//         }

//         for ( long i = 2; i <= 1000000; i*=i){
//             System.out.println(i);
//         }

        // Fizz Buzz
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        boolean userWantsToContinue = false;
        do {
            int userInput = scanner.nextInt();
            System.out.println("Here is your table!");
            scanner.nextLine();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInput; i++){
//              left justified spaces in line below
                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
            }
        } while (userWantsToContinue);

        String userChoice = "yes";
        while (!userChoice.equals("no")) {
            System.out.println("Enter the student's numerical grade from 0 to 100: ");
            byte grade = scanner.nextByte();
            char letterGrade;
            if ( grade <= 59) {
                letterGrade = 'F';
            } else if (grade <= 66) {
                letterGrade = 'D';
            } else if ( grade <= 79) {
                letterGrade = 'C';
            } else if ( grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade?(yes/no)");
            userChoice = scanner.next();
        }
    } // end main
} // end class
