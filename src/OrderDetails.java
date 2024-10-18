package src;
class OrderDetails {
    private Product product;
    private int quantity;
    private double price;

    public OrderDetails(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Getters and setters (optional)
}
