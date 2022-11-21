public class MovieWithDirector extends Movie {
    private String director;

    public MovieWithDirector(String title, MovieGenre genre, int price, long productId, String director) {
        super(title, genre, price, productId);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void printDetails(){
        System.out.println("\nTitle: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre.toString().substring(0, 1).toUpperCase() + genre.toString().substring(1).toLowerCase());
        System.out.println("Price: " + price +":-");
        System.out.println("Product ID: " + productId);
    }

}
