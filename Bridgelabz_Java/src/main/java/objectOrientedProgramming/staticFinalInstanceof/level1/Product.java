package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Product {
    private static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = Math.max(price, 0);
        this.quantity = Math.max(quantity, 0);
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            System.out.println("Discount must be between 0 and 100.");
        }
    }

    private double calculateTotal() {
        double amount = price * quantity;
        return amount - (amount * discount / 100);
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.printf("Total after discount: %.2f%n", calculateTotal());
    }

    public static void processIfProduct(Object object) {
        if (object instanceof Product) {
            Product product = (Product) object;
            product.displayDetails();
        } else {
            System.out.println("The object is not a Product.");
        }
    }

    public static void main(String[] args) {
        Product product = new Product("Keyboard", 1500.0, 2, "P1001");

        processIfProduct(product);

        System.out.println("\nAfter updating discount:");
        Product.updateDiscount(15.0);
        processIfProduct(product);

        System.out.println("\nChecking a different object:");
        processIfProduct(250);
    }
}