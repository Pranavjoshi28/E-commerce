import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    private List<Customer>customers;
    public Admin(String name, String userType, int id) {
        super(name, userType, id);
        customers=new ArrayList<>();
    }
    public void checkStock(Product product){
        if(product.getStockLeft()==0){
            System.out.println("Stock finished.");

        }
        else{
            System.out.println("Stock is available.");
        }
    }
    public void createAccount(Customer customer){
        customers.add(customer);
        System.out.println("Account created.");
    }
    }
