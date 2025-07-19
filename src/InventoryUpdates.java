public class InventoryUpdates {
    public void isInStock(Product product){
        if(product.getStockLeft()>0){
            System.out.println("Type of product you're checking is available.");
        }
        else {
            System.out.println(product.getProductName()+" is not available we are trying to bring in stock.");
        }
    }
}
