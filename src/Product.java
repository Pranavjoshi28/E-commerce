public class Product {
    private String productName;
    private int productNumber;
    private int stockLeft;
    private double price;
    private String type;

    public Product(String productName, int productNumber, int stockLeft, double price) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.stockLeft = stockLeft;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getStockLeft() {
        return stockLeft;
    }

    public void setStockLeft(int stockLeft) {
        this.stockLeft = stockLeft;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

