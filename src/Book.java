import java.util.ArrayList;

public class Book extends Product {
    protected String title;
    protected String author;
    protected static ArrayList<Book> bookList = new ArrayList<>();

    public Book(){
        this(null, null, 0,0);
    }

    public Book(String title, String author, int price, long productId) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.productId = productId;
        productz.add(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printBookDetails(){
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + ":-");
    }

    @Override
    public void printDetails(){
        System.out.println("Product ID: " + productId + " Price: " + price);
    }


}
