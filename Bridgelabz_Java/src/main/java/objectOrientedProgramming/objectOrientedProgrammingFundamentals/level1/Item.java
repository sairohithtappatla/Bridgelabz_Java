package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level1;

import java.util.Scanner;

public class Item {

    // Instance variables store item details
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(int itemCode, String itemName, double price) {
        setItemCode(itemCode);
        setItemName(itemName);
        setPrice(price);
    }

    // Getter method to return item code
    public int getItemCode() {
        return itemCode;
    }

    // Setter method to update item code
    public void setItemCode(int itemCode) {
        if (itemCode <= 0) {
            throw new IllegalArgumentException("Item code must be positive.");
        }
        this.itemCode = itemCode;
    }

    // Getter method to return item name
    public String getItemName() {
        return itemName;
    }

    // Setter method to update item name
    public void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        this.itemName = itemName;
    }

    // Getter method to return item price
    public double getPrice() {
        return price;
    }

    // Setter method to update item price
    public void setPrice(double price) {
        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Price must be a non-negative finite number.");
        }
        this.price = price;
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price per Item: %.2f%n", price);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get item details
            System.out.print("Enter item code: ");
            int itemCode = Integer.parseInt(input.nextLine());

            System.out.print("Enter item name: ");
            String itemName = input.nextLine();

            System.out.print("Enter item price: ");
            double price = Double.parseDouble(input.nextLine());

            // Create Item object
            Item item = new Item(itemCode, itemName, price);

            // Get quantity for cost calculation
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(input.nextLine());

            // Display item details and total cost
            System.out.println("\nItem Details");
            item.displayDetails();
            System.out.printf("Quantity: %d%n", quantity);
            System.out.printf("Total Cost: %.2f%n", item.calculateTotalCost(quantity));
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}