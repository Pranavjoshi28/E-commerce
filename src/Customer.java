import java.util.ArrayList;
import java.util.List;

public class Customer extends User implements Payment{
    private double balance;
    private List<String>orderHistory;
    public Customer(String name, String userType, int id,double balance) {
        super(name, userType, id);
        this.balance=balance;
        this.orderHistory=new ArrayList<>();
    }

    @Override
    public void debitCard(double amount,Product product) {
        if(balance>amount && amount==product.getPrice() && product.getStockLeft()>0){
            System.out.println("Payment made successful for "+product.getProductName());
            orderHistory.add(product.getProductName());
            product.setStockLeft(product.getStockLeft()-1);
        }
        else{
            System.out.println("Insufficient balance or amount is wrong ");
        }
    }

    @Override
    public void payOnline(double amount,Product product) {
        debitCard(amount,product);
    }
    public void getOrderHistory(){
        for (String j:orderHistory) {
            System.out.println(j);
        }
    }
}
