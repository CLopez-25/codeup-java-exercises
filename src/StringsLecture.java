import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        String teacher = "teacher";
        System.out.println(teacher);
        teacher = "not teacher";
        String javier = "javier";
        String anotherJavier = "javier";



        System.out.println(teacher);
        System.out.println(javier);
        System.out.println(javier.hashCode());
        System.out.println(anotherJavier.hashCode());
        System.out.println(javier == anotherJavier);
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();
        System.out.println(javier.equals(userInput));
    }
}

// the original string will stay untouched, you are actually creating a new string