public class MovieWithDirector extends Movie {
    protected String director;

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

}
