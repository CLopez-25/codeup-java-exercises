package com.codeup.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {

        // ============================ PATH
        // src/fileIOLecture/test.txt
//        Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt");
//        System.out.println(pathToTest);

//        Path pathToWeywot = Paths.get("hello", "weywot.txt");
//        System.out.println(pathToWeywot);


        // the files do not have to exist:
//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
////        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS

//        Path fileLecturePath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        Path gitignoreFile = Paths.get(".gitignore");
//        System.out.println(Files.exists(fileLecturePath));
//        System.out.println(Files.exists(Paths.get("bob.txt")));


        // if a folder does not exist, this program will create it for you:
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        System.out.println(dataDirectory);
//        System.out.println(dataFile);
//
//        if (Files.notExists(dataDirectory)) {
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
////      you can also create files:
//        if (Files.notExists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

//        Path p = Paths.get("src","test.txt");
////
//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }



//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

        // this adds the arrayList of names to the file selected:
        Path p = Paths.get("src", "test.txt");

        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
        try {
            Files.write(p, newNames, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
//
        List<String> names = new ArrayList<>();
        names.add("Tim");
        names.add("Sally");
        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }


    }
}
