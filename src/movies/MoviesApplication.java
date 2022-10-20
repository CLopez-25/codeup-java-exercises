package com.codeup.java.movies;
import com.codeup.java.util.Input;



public class MoviesApplication {

    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for(Movie movie : movies){
            String name = movie.getMovieName();
            if(category.equals(movie.getCategory())) {
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }
    public static Movie[] addMovie(Movie newMovie, Movie[] movies){
        Movie[] newMovieArray;
        newMovieArray = new Movie[movies.length + 1];
        for (int i =0; i < movies.length; i++){
            newMovieArray[i] = movies[i];
        }
        newMovieArray[newMovieArray.length - 1] = newMovie;
        return newMovieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        //this will assign all the movies in the array in a variable
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "YO";

        while (!userChoice.equals("0")) {
            System.out.println("What would you like to do? \n");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - Animated");
            System.out.println("3 - Drama");
            System.out.println("4 - Horror");
            System.out.println("5 - SciFi");
            System.out.println("6 - add a movie to the list\n");
            userChoice = input.getString("Enter your choice: ");
            switch (userChoice){
                case "0":
                    break;
                case "1":
                    for(Movie movie : movies){
                        String category = movie.getCategory();
                        String name = movie.getMovieName();
                        if(category.equals("animated")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "2":
                    getAllMoviesFromCategory("Animated", movies);
                    break;
                case "3":
                    getAllMoviesFromCategory("Drama", movies);
                    break;
                case "4":
                    getAllMoviesFromCategory("Horror", movies);
                    break;
                case "5":
                    getAllMoviesFromCategory("SciFi", movies);
                    break;
                case "6":
                    String title = input.getString("Enter the movie name:");
                    String category = input.getString("Enter the category of the movie:");
                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(newMovie, movies);
                    break;
                default:
                    System.out.println("FOLLOW DIRECTIONS!");
                    break;
            }
        }
    }
}
