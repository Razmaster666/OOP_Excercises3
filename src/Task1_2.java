public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness", "HP Lovecraft", 98);
        Book book2 = new Book("Doktor Glas", "Hjalmar Söderberg", 120);

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79);
        Movie movie2 = new Movie("Back to the Future", MovieGenre.COMEDY, 89);
        Movie movie3 = new Movie("Lost Highway", MovieGenre.DRAMA, 120, "David Lynch");
        Movie movie4 = new Movie();

        Movie.displayAllMovies();

        Book.displayAllBooks();

    }
}