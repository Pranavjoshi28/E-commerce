import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Product>products=new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.add(product);
    }
    public void productInfo(Product product){
        System.out.println("Product name: "+product.getProductName()+
                "\nProduct number: "+product.getProductNumber()+
                "\nstockLeft: "+product.getStockLeft()+
                "\nProduct price: "+product.getPrice()+"SEK");
    }
}
