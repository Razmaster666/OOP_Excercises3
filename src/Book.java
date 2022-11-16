import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int price;
    private static ArrayList<Book> bookList = new ArrayList<>();

    public Book(){
        this(null, null, 0);
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookList.add(this);
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

    public static ArrayList<Book> getBookList() {
        return bookList;
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

    public static void displayAllBooks(){
        for (Book book : Book.getBookList()) {
            book.printBookDetails();
        }
    }
}
