public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
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

    public void printMovieDetails(){
        System.out.println("\nTitle: " + getTitle());
        System.out.println("Genre: " + getGenre().toString().substring(0,1).toUpperCase() + getGenre().toString().substring(1).toLowerCase());
        System.out.println("Price: " + getPrice() + ":-");
    }
}
