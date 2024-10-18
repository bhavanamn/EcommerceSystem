package src;
class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int quantity) throws Exception {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new Exception("Insufficient stock");
        }
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Getters and setters (optional)
}
