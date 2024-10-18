package src;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating a user
        User user = new User(1, "Bhavana Murahari", "bhavana@example.com");

        // Creating products
        Product product1 = new Product(101, "Headphones", 150, 10);
        Product product2 = new Product(102, "Neckband", 80, 20);

        // Creating an order
        Order order = new Order(1001);
        try {
            order.addProduct(product1, 2);  // Adding 2 headphones
            order.addProduct(product2, 1);  // Adding 1 neckband
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Associating the order with the user
        user.createOrder(order);

        // Making a payment
        Payment payment = new Payment(5001, 380, "Credit Card", new Date());
        order.makePayment(payment);

        // Viewing user's orders
        user.viewOrders();
    }
}
