package objectOrientedProgramming.Constructors.level2;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = Math.max(price, 0);
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product first = new Product("Keyboard", 1200.0);
        Product second = new Product("Mouse", 600.0);

        first.displayProductDetails();
        second.displayProductDetails();
        Product.displayTotalProducts();
    }
}