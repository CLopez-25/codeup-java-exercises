import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("Quit")){
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        }
    } // main end
} // class end
