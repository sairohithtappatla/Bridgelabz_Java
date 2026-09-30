package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level2;

import java.util.Scanner;

public class CartItem {

    // Instance variables store cart item details
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize cart item attributes
    public CartItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
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
            throw new IllegalArgumentException("Price must be non-negative and finite.");
        }
        this.price = price;
    }

    // Getter method to return item quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method to update item quantity
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    // Method to add a quantity of this item to the cart
    public void addItem(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Quantity to add must be positive.");
        }
        quantity += amount;
    }

    // Method to remove a quantity of this item from the cart
    public boolean removeItem(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Quantity to remove must be positive.");
        }

        // Check whether enough items are available to remove
        if (amount > quantity) {
            return false;
        }

        // Update quantity after removal
        quantity -= amount;
        return true;
    }

    // Method to calculate total cost of the cart item
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display cart item details
    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: %.2f%n", calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get cart item details
            System.out.print("Enter item name: ");
            String itemName = input.nextLine();

            System.out.print("Enter item price: ");
            double price = Double.parseDouble(input.nextLine());

            System.out.print("Enter initial quantity: ");
            int quantity = Integer.parseInt(input.nextLine());

            // Create CartItem object
            CartItem cartItem = new CartItem(itemName, price, quantity);

            // Get quantity to add
            System.out.print("Enter quantity to add: ");
            int amountToAdd = Integer.parseInt(input.nextLine());

            // Add items to cart
            cartItem.addItem(amountToAdd);

            // Get quantity to remove
            System.out.print("Enter quantity to remove: ");
            int amountToRemove = Integer.parseInt(input.nextLine());

            // Remove items from cart
            if (cartItem.removeItem(amountToRemove)) {
                System.out.println("Items removed successfully.");
            } else {
                System.out.println("Not enough items in the cart to remove.");
            }

            // Display updated cart item details
            System.out.println("\nCart Item Details");
            cartItem.displayDetails();
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}