public class ChildrensBook extends Book {

    private String recommendedAgeInfo;

    public ChildrensBook() {
    }

    public ChildrensBook(String title, String author, int price, long productId, String recommendedAgeInfo) {
        super(title, author, price, productId);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Recommended age: " + recommendedAgeInfo);

    }
}
