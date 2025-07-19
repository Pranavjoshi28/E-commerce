public interface Payment {
    void debitCard(double amount,Product product);
    void payOnline(double amount,Product product);
}
