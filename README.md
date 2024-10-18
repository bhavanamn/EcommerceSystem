E-commerce System
This project implements a basic e-commerce system where users can place orders for products and make payments. The system is designed using Java and follows an object-oriented approach. It includes users, products, orders, and payments.

Project Structure
The project is organized into the following components:

User: Represents a customer who can place orders.
Product: Represents products available for purchase, with details such as ID, name, price, and stock.
Order: Represents an order placed by a user, which contains multiple products.
OrderDetails: Manages the details of products and quantities in an order.
Payment: Handles payments made for an order.
Main: The entry point of the application where the user creates orders, adds products, and makes payments.
Project Directory Structure:
css
Copy code
EcommerceSystem
│
└───src
    │
    ├───Main.java
    ├───User.java
    ├───Product.java
    ├───Order.java
    ├───OrderDetails.java
    └───Payment.java
Requirements
Java Development Kit (JDK): Ensure you have JDK 11 or above installed. You can download it from here.
VS Code: Recommended IDE for running the project. Ensure that the Java Extension Pack is installed.
How to Run
1. Clone the Repository or Set Up Project
Create a new directory for the project:


mkdir EcommerceSystem
cd EcommerceSystem
Create a src folder inside this directory and place all the Java files (Main.java, User.java, Product.java, Order.java, OrderDetails.java, Payment.java) inside the src folder.

2. Compile the Project
Navigate to the project directory (EcommerceSystem), and run the following command to compile the Java files:

javac src/*.java
This will compile all the Java files in the src folder and generate .class files.

3. Run the Application
After compilation, run the Main class:


java src.Main
4. Sample Output
The application simulates creating a user, placing an order for products, making a payment, and viewing the user's orders. A sample output may look like this:



Order ID: 1001, Status: completed
Class Diagram



Features
Users can create and manage multiple orders.
Orders can contain multiple products.
Payments can be made for orders using different methods.
The status of an order is updated after a payment is made.
Future Enhancements
Add more order statuses such as shipped, delivered, etc.
Implement user authentication and authorization.
Implement database integration for storing users, products, and orders.
