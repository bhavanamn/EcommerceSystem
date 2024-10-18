package src;
import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private String status;
    private List<OrderDetails> products;
    private Payment payment;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = "pending";
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) throws Exception {
        if (product.getStock() >= quantity) {
            product.updateStock(quantity);
            products.add(new OrderDetails(product, quantity));
        } else {
            throw new Exception("Product " + product.getName() + " is out of stock.");
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void makePayment(Payment payment) {
        this.payment = payment;
        this.status = "completed";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

   
