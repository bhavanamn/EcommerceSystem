package src;
import java.util.ArrayList;
import java.util.List;

class User {
    private int userId;
    private String name;
    private String email;
    private List<Order> orders;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getStatus());
        }
    }

    // Getters and setters (optional)
}
