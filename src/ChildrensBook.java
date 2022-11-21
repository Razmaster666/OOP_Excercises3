public class ChildrensBook extends Book {

    private String recommendedAgeInfo;

    public ChildrensBook() {
    }

    public ChildrensBook(String title, String author, int price, String recommendedAgeInfo) {
        super(title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printBookDetails(){
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + ":-");
        System.out.println("Recommended age " + recommendedAgeInfo);
    }
}
