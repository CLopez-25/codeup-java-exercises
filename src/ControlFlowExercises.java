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

//         for ( long i = 2; i <= 1000000; i*=i){
//             System.out.println(i);
//         }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        boolean userWantsToContinue = false;
        do {
            int userInput = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInput; i++){
                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
            }
        } while (userWantsToContinue);
    }
}
