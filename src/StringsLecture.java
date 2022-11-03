package com.codeup.java;

import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        String javier = "javier";
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));

        String alsoJavier = "javier";
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        javier = javier + "ruedas";
        alsoJavier = javier;


        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        String letsTryThis = "javier";
        System.out.println(Integer.toHexString((System.identityHashCode(letsTryThis))));

        String theOriginalJavier = "javier";
        System.out.println(letsTryThis == theOriginalJavier);

        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name?");
        String userName = scanner.next();
        System.out.println(theOriginalJavier == userName);
        System.out.println(theOriginalJavier.equals(userName));

    } // main end
} // class end

// the original string will stay stored in the systems memory, you are actually creating a new string it'll just reference to the original string and it'll evaluate to true