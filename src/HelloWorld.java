public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFavoriteNumber = 17;
        System.out.println(myFavoriteNumber);

//        String myString = "string value";
//        System.out.println(myString);

        char newString = 'a';
        System.out.println(newString);

        double myString = 3.124159F;
        System.out.println(myString);

//        long myNumber = 123;
//        System.out.println(myNumber);

        double myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        System.out.println(x * y);

//          int x = 10;
//          int y = 2;
//        System.out.println(x / y);
//        System.out.println(y - x);

          int x = 10;
          int y = 2;
//        x = x / y;
//        y = y - x;
          y -= (x /= y);
        System.out.println(y);
        System.out.println(x);

        int maximunInteger = Integer.MAX_VALUE;
        System.out.println(maximunInteger);
    }
}