import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int price;
    private static ArrayList<Book> bookList = new ArrayList<>();

    public Book(){

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBookDetails(){
        System.out.println("\nTitle: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice() + ":-");
    }

    public static void displayAll(){
        for (Movie movie : Movie.getMovieList()) {
            movie.printMovieDetails();
        }
    }
}
