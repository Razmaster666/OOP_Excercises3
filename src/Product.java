import java.util.ArrayList;
import java.util.List;

public class Product {

    protected long productId;
    protected int price;
    protected static List<Product> productz = new ArrayList<>();

    public static List<Product> getProductz() {
        return productz;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
