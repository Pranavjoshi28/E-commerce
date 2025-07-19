public class Test {
    public static void main(String[] args) {
        Electronics smartPhone=new Electronics("Apple",123445,1,10000);
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(smartPhone);
        shoppingCart.productInfo(smartPhone);
        InventoryUpdates iu=new InventoryUpdates();
        iu.isInStock(smartPhone);
        Customer vikas=new Customer("Vikas sharma","Customer",1234,9000);
        vikas.payOnline(10000,smartPhone);
        vikas.getOrderHistory();
        System.out.println(smartPhone.getStockLeft());
    }
}
