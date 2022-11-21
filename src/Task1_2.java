import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1_2 {

    static List<Product> productz = new ArrayList<>();
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98, 55123);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120, 57825);

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79, 4566L);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89, 9999L);
        Movie movie3 = new Movie("Back to the Future 2", MovieGenre.COMEDY, 89, 2242L);
        Movie movie4 = new Movie("King Kong", MovieGenre.COMEDY, 89, 5653L);
        ChildrensBook cb = new ChildrensBook("Nalle Puh", "Charles McCharles", 89, 912424, "3-6 years");

        MovieWithDirector ran = new MovieWithDirector("Ran", MovieGenre.ACTION,132,666,"Akira Kurosawa");


//        displayAllProducts();
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        Collections.sort(movies);
        productz.addAll(movies);


        displayAllProductsWithOverride();

//        displayAllMovies();
//        displayAllBooks();


    }

//    public static void displayAllProductsWithAbstract(){
//        for (Product product : Product.getProductz()) {
//            if (product instanceof Book) {
//                Book book = (Book) product;
//                book.printBookDetails();
//            } else if (product instanceof Movie) {
//                Movie movie = (Movie) product;
//                movie.printMovieDetails();
//            }
//        }
//    }

    public static void displayAllProductsWithOverride() {
        for (Product product : productz) {
            product.printDetails();
        }
    }

    public static void displayAllBooks() {
        for (Book book : Book.getBookList()) {
            book.printDetails();
        }
    }

    public static void displayAllMovies() {
        for (Movie movie : Movie.getMovieList()) {
            movie.printDetails();
        }
    }
}