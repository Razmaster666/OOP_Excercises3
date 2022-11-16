public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness","HP Lovecraft",98);
        Book book2 = new Book("Doktor Glas","Hjalmar Söderberg",120);

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79);
        Movie movie2 = new Movie("Back to the Future",MovieGenre.COMEDY,89);
        Movie movie3 = new Movie("Lost Highway",MovieGenre.DRAMA,120, "David Lynch");


        Book [] bookArray = new Book[2];
        bookArray[0] = book1;
        bookArray[1] = book2;

//        displayAllBooks(bookArray);

        Book.displayAllBooks(bookArray);

        Movie [] movieArray = new Movie[3];
        movieArray[0] = movie1;
        movieArray[1] = movie2;
        movieArray[2] = movie3;

//        displayAllMovies(movieArray);

        Movie.displayAllMovies(movieArray);

    }
    public static void displayAllBooks(Book [] x){
        for(Book book: x){
            book.printBookDetails();
        }
    }
    public static void displayAllMovies(Movie [] x){
        for(Movie movie: x){
            movie.printMovieDetails();
        }
    }

}