import java.util.*;

public class Movie extends Product {
    private String title;
    private MovieGenre genre;
    private String director;
    private static List<Movie> movieList = new ArrayList<>();
    private static Map <Long, Movie> movieMap = new HashMap<>();

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
        productz.add(this);
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

    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static Map<Long, Movie> getMovieMap() {
        return movieMap;
    }

    public long getProductId() {
        return productId;
    }



//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setGenre(MovieGenre genre) {
//        this.genre = genre;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public void setDirector(String director) {
//        this.director = director;
//    }
//
//    public void setProductId(long productId) {
//        this.productId = productId;
//    }
//
//    public static void setMovieList(ArrayList<Movie> movieList) {
//        Movie.movieList = movieList;
//    }

    @Override
    public void printDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Genre: " + genre.toString().substring(0, 1).toUpperCase() + genre.toString().substring(1).toLowerCase());
        if (!getDirector().equals("Unknown")) {
            System.out.println("Director: " + director);
        }
    }

    public static void searchMovie(Long productId){
        System.out.println(movieMap.get(productId));
    }



    public long randomNumber(){
        double random = Math.random() * 6000;
        long random2 = (long)random;
        return random2;
    }

    @Override
    public String toString(){
        return title + " " + productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return productId == movie.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
