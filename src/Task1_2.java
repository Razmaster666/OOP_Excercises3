public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book("Mountain of Madness","HP Lovecraft",98);
        Book book2 = new Book("Doktor Glas","Hjalmar Söderberg",120);

        Movie movie1 = new Movie("Godzilla", MovieGenre.ACTION, 79);
        Movie movie2 = new Movie("Back to the Future",MovieGenre.COMEDY,89);



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