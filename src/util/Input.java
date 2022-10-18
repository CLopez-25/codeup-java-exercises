package com.codeup.java.util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }




    public Input(){
        scanner = new Scanner(System.in);
    }
}
