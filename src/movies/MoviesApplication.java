package com.codeup.java.movies;

import com.codeup.java.util.Input;
import java.util.Arrays;
import java.util.Scanner;

import static com.codeup.java.movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("""
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                """);
        Input input = new Input();
        int b = input.getInt(0, 5);
        System.out.println("Your number was " + b);
        Movie[] myAllMovies = findAll();
        switch (b) {
            case 1:
                for (Movie myAllMovie : myAllMovies) {
                    System.out.println(myAllMovie.getMovieName() + " -- " + myAllMovie.getCategory());
                }
            case 2:
                for (Movie myAllMovie : myAllMovies) {
                    if (myAllMovie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(myAllMovie.getMovieName() + " -- " + myAllMovie.getCategory());
                    }
                }
            case 3:
                for (Movie myAllMovie : myAllMovies) {
                    if (myAllMovie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(myAllMovie.getMovieName() + " -- " + myAllMovie.getCategory());
                    }
                }
            case 4:
                for (Movie myAllMovie : myAllMovies) {
                    if (myAllMovie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(myAllMovie.getMovieName() + " -- " + myAllMovie.getCategory());
                    }
                }
            case 5:
                for (Movie myAllMovie : myAllMovies) {
                    if (myAllMovie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(myAllMovie.getMovieName() + " -- " + myAllMovie.getCategory());
                    }
                }
        }//End of Switch Statement=============================
    }
}
