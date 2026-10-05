import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
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

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax: 18%";
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax: 5%";
    }
}

class Groceries extends Product implements Taxable {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries tax: 5%";
    }
}

public class ECommercePlatform {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(
            new Electronics(101, "Laptop", 80000)
        );

        products.add(
            new Clothing(102, "Jacket", 5000)
        );

        products.add(
            new Groceries(103, "Rice", 2000)
        );

        for (Product product : products) {

            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
            }

            double finalPrice =
                product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: ₹" + product.getPrice());
            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);

            System.out.println("--------------------");
        }
    }
}