import java.util.*;

public class Movie implements Product, Comparable<Movie> {
    protected String title;
    protected MovieGenre genre;
    protected long productId;
    protected int price;
    protected static List<Movie> movieList = new ArrayList<>();
    protected static Map <Long, Movie> movieMap = new HashMap<>();

    public Movie() {
        this("Unknown", MovieGenre.UNKNOWN, 0, 0L);

    }

    public Movie(String title, MovieGenre genre, int price, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
        movieList.add(this);
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

//
//    public void setProductId(long productId) {
//        this.productId = productId;
//    }
//
//    public static void setMovieList(ArrayList<Movie> movieList) {
//        Movie.movieList = movieList;
//    }


    public void printDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Genre: " + genre.toString().substring(0, 1).toUpperCase() + genre.toString().substring(1).toLowerCase());
        System.out.println("Price: " + price +":-");
        System.out.println("Product ID: " + productId);
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

    @Override
    public int compareTo(Movie movie){
        if(productId == movie.productId){
            return 0;
        }
        else if(productId < movie.productId){
            return -1;
        }
        else return 1;
    }
}
