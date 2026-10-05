package objectOrientedProgramming.objectOrientedDesign.selfProblems.level1.ecommerce;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = Math.max(price, 0);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        if (order != null && !orders.contains(order)) {
            orders.add(order);
            System.out.println(name + " placed an order.");
        }
    }

    public void displayOrders() {
        System.out.println("\nOrders placed by " + name + ":");
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println(product.getProductName() + ": " + product.getPrice());
        }
        System.out.printf("Order Total: %.2f%n", calculateTotal());
    }
}

public class EcommerceOrderAssociation {
    public static void main(String[] args) {
        Customer customer = new Customer("Rohith");

        // Products are created independently and added to an order.
        Product laptop = new Product("Laptop", 55000.0);
        Product mouse = new Product("Mouse", 800.0);
        Product keyboard = new Product("Keyboard", 1500.0);

        Order order1 = new Order("ORD1001");
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order("ORD1002");
        order2.addProduct(keyboard);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.displayOrders();
    }
}