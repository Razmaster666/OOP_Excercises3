public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120);
        Book book3 = new Book();

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79, 9999L);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89, 9999L);
        Movie movie3 = new Movie("Lost Highway", MovieGenre.DRAMA, 120, "David Lynch", 99995L);
        Movie movie4 = new Movie();

        ChildrensBook cb = new ChildrensBook("Nalle Puh", "Charles McCharles", 89, "From 4 years");

        displayAllProducts();

    }

    public static void displayAllProducts(){
        for (Product product : Product.getProductz()) {
            if (product instanceof Book) {
                Book book = (Book) product;
                book.printBookDetails();
            } else if (product instanceof Movie) {
                Movie movie = (Movie) product;
                movie.printMovieDetails();
            }
        }
    }

    public static void displayAllBooks(){
        for (Book book : Book.getBookList()) {
            book.printBookDetails();
        }
    }

    public static void displayAllMovies() {
        for (Movie movie : Movie.getMovieList()) {
            movie.printMovieDetails();
        }
    }
}