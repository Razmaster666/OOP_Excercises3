public class Task1_2 {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.author = "HP Lovecraft";
        book1.title = "Mountain of Madness";
        book1.price = 98;

        book2.author = "Hjalmar Söderberg";
        book2.title = "Doktor Glas";
        book2.price = 120;

//        printBookDetails(book2);

        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.title = "Godzilla";
        movie1.genre = MovieGenre.ACTION;
        movie1.price = 79;

        movie2.title = "Back to the Future";
        movie2.genre = MovieGenre.COMEDY;
        movie2.price = 89;

//        printMovieDetails(movie2);

        Book [] bookArray = new Book[2];
        bookArray[0] = book1;
        bookArray[1] = book2;

        for(Book book: bookArray){
            printBookDetails(book);
        }

        Movie [] movieArray = new Movie[2];
        movieArray[0] = movie1;
        movieArray[1] = movie2;

        for(int i = 0; i < movieArray.length; i++){
            printMovieDetails(movieArray[i]);
        }

    }

    public static void printBookDetails(Book book){
        System.out.println("\nTitle: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price + ":-");
    }

    public static void printMovieDetails(Movie movie){
        System.out.println("\nTitle: " + movie.title);
        System.out.println("Genre: " + movie.genre.toString().substring(0,1).toUpperCase() + movie.genre.toString().substring(1).toLowerCase());
        System.out.println("Price: " + movie.price + ":-");
    }
}