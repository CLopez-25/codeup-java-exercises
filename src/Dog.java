public class Dog {
//    public static void bark(){
//        System.out.println("Woof Woof!");
//    }

    public static String bark(){
        System.out.println("Woof woof!");
        return "Woof woof";
    }

    public static void bark(int weight){
        if (weight < 25){
            System.out.println("yip yip");
        } else {
            System.out.println("woof woof");
        }
    }

    public static void bark(int weight, String name){
        System.out.printf("%s goes ", name);
        bark(weight);
//        String output = name + "goes";
//        if (weight < 25){
//            output += "yip yip";
//        } else {
//            output += "woof woof";
//        }
//        System.out.println(output);
    }

    public static void main(String[] args) {
//        String bark = bark();
//        System.out.println(bark);
        System.out.println(bark());

//        bark();
//        bark(15);
//        bark(50);
//        bark(50, "rudo");
//        bark(15, "fido");
    }
}

// public class means we access this class from anywhere in our project
// static means i dont have to create an object (dog)
// void means it doesnt return anything