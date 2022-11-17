import java.util.List;

public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120);
        Book book3 = new Book();

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79,9999L);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89, 9999L);
        Movie movie3 = new Movie("Lost Highway", MovieGenre.DRAMA, 120, "David Lynch", 99995L);
        Movie movie4 = new Movie();


//        Movie.searchMovie(9999L);

//        Map<Long, Movie> movieMap2 = new HashMap<>();
//
//        movieMap2.put(3L, movie1);
//
//        System.out.println(movieMap2.get(3L));

            Movie.displayAllMovies();

        findMovieById(9999L,Movie.getMovieList());


    }

    public static Movie findMovieById(long productId, List<Movie> movieList) {
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


//    public static Movie findMovieById(long productId, List<Movie> movieList) {
//        for (Movie movie : movieList) {
//            if (movie.getProductId() == productId) {
//                System.out.println("\nFound this movie:");
//                movie.printMovieDetails();
//                return movie; // ?
//            }
//        }
//        System.out.println("\nDidn't find a movie with productId: " + productId);
//        return null; // ?
//    }

}