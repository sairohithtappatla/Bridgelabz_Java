package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level1;

import java.util.Scanner;

public class MobilePhone {

    // Instance variables store phone characteristics
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize mobile phone attributes
    public MobilePhone(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    // Getter method to return brand
    public String getBrand() {
        return brand;
    }

    // Setter method to update brand
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand;
    }

    // Getter method to return model
    public String getModel() {
        return model;
    }

    // Setter method to update model
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        this.model = model;
    }

    // Getter method to return price
    public double getPrice() {
        return price;
    }

    // Setter method to update price
    public void setPrice(double price) {
        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Price must be a non-negative finite number.");
        }
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: %.2f%n", price);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get phone details
            System.out.print("Enter phone brand: ");
            String brand = input.nextLine();

            System.out.print("Enter phone model: ");
            String model = input.nextLine();

            System.out.print("Enter phone price: ");
            double price = Double.parseDouble(input.nextLine());

            // Create MobilePhone object
            MobilePhone phone = new MobilePhone(brand, model, price);

            // Display phone details
            System.out.println("\nMobile Phone Details");
            phone.displayDetails();
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}