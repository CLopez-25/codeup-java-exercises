//package com.codeup.java.movies;
//
//import util.Input;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import static movies.MoviesArray.findAll;
//
//public class MoviesApplication {
//
//    public static void main (String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n");
//        Input input = new Input();
//        int b = input.getInt(0, 5);
//        System.out.println("Your number was " + b);
//        Movie[] myAllMovies = findAll();
//        switch (b) {
//            case 1:
//                for(int i = 0; i < myAllMovies.length; i++){
//                    System.out.println(myAllMovies[i].getMovieName() + " ||Category: " + myAllMovies[i].getCategory());
//                }
//            case 2: for(int i = 0; i < myAllMovies.length; i++){
//                if(myAllMovies[i].getCategory().equalsIgnoreCase("animated")){
//                    System.out.println(myAllMovies[i].getMovieName());
//                }
//            }
//            case 3: for(int i = 0; i < myAllMovies.length; i++){
//                if(myAllMovies[i].getCategory().equalsIgnoreCase("drama")){
//                    System.out.println(myAllMovies[i].getMovieName());
//                }
//            }
//            case 4: for(int i = 0; i < myAllMovies.length; i++){
//                if(myAllMovies[i].getCategory().equalsIgnoreCase("horror")){
//                    System.out.println(myAllMovies[i].getMovieName());
//                }
//            }
//            case 5: for(int i = 0; i < myAllMovies.length; i++){
//                if(myAllMovies[i].getCategory().equalsIgnoreCase("scifi")){
//                    System.out.println(myAllMovies[i].getMovieName());
//                }
//            }
//        }//End of Switch Statement=============================
//    }
//
//
//}
