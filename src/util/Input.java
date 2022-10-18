package com.codeup.java.util;
import java.util.Scanner;

public class Input {
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }
}
