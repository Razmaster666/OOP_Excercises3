import java.util.ArrayList;

public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120);
        Book book3 = new Book();

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79,9999L);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89, 244556L);
        Movie movie3 = new Movie("Lost Highway", MovieGenre.DRAMA, 120, "David Lynch", 99995L);
        Movie movie4 = new Movie();


        movie3.printMovieDetails();

//        Movie.displayAllMovies();

//        Book.displayAllBooks();

//        findMovieById(244556L,Movie.getMovieList());

//        MovieRecord movieRec1 = new MovieRecord("Bomb");
//
//        System.out.println(movieRec1);


    }

    public static Movie findMovieById(long productId, ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            if (movie.getProductId() == productId) {
                System.out.println("\nFound this movie:");
                movie.printMovieDetails();
                return movie; // ?
            }
        }
        System.out.println("\nDidn't find a movie with productId: " + productId);
        return null; // ?
    }

}