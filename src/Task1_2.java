public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98, 55123);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120, 57825);

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79, 9999L);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89, 9999L);
        Movie movie3 = new Movie("Lost Highway", MovieGenre.DRAMA, 120, "David Lynch", 99995L);

        ChildrensBook cb = new ChildrensBook("Nalle Puh", "Charles McCharles", 89, 912424, "3-6 years");

//        displayAllProducts();


        displayAllProductsWithOverride();


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
        for (Product product : Product.getProductz()) {
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