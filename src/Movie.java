import java.util.ArrayList;

public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;
    private long productId;
    private static ArrayList<Movie> movieList = new ArrayList<>();

    public Movie() {
        this("Unknown", MovieGenre.UNKNOWN, 0, "Unknown", 0L);
    }

    public Movie(String title, MovieGenre genre, int price, long productId) {
        this(title, genre, price, "Unknown", productId);
    }

    public Movie(String title, MovieGenre genre, int price, String director, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
        this.productId = productId;
        movieList.add(this);
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public static ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public long getProductId() {
        return productId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public static void setMovieList(ArrayList<Movie> movieList) {
        Movie.movieList = movieList;
    }

    public void printMovieDetails() {
        System.out.println("\nTitle: " + getTitle());
        System.out.println("Genre: " + getGenre().toString().substring(0, 1).toUpperCase() + getGenre().toString().substring(1).toLowerCase());
        System.out.println("Price: " + getPrice() + ":-");
        System.out.println("Product ID: " + getProductId());
        if (!getDirector().equals("Unknown")) {
            System.out.println("Director: " + getDirector());
        }
    }

    public static void displayAllMovies() {
        for (Movie movie : Movie.getMovieList()) {
            movie.printMovieDetails();
        }
    }

    public static Movie findMovieById(long productId, ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            if (movie.getProductId() == productId) {
                System.out.println("\nFound this movie:");
                movie.printMovieDetails();
                return movie;
            }
        }
        System.out.println("\nDidn't find a movie with productId: " + productId);
        return null;
    }

}
