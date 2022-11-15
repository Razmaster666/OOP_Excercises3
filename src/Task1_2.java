public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setAuthor("HP Lovecraft");
        book1.setTitle("Mountain of Madness");
        book1.setPrice(98);

        book2.setAuthor("Hjalmar Söderberg");
        book2.setTitle("Doktor Glas");
        book2.setPrice(120);

//        book2.printBookDetails();

        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.setTitle("Godzilla");
        movie1.setGenre(MovieGenre.ACTION);
        movie1.setPrice(79);

        movie2.setTitle("Back to the Future");
        movie2.setGenre(MovieGenre.COMEDY);
        movie2.setPrice(89);

//        movie2.printMovieDetails();

        Book [] bookArray = new Book[2];
        bookArray[0] = book1;
        bookArray[1] = book2;

        for(Book book: bookArray){
            book.printBookDetails();
        }

        Movie [] movieArray = new Movie[2];
        movieArray[0] = movie1;
        movieArray[1] = movie2;

        for(int i = 0; i < movieArray.length; i++){
            movieArray[i].printMovieDetails();
        }

    }
}