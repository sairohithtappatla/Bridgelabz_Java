import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(
            String itemName,
            double price,
            int quantity) {

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println(
            "Total: ₹" +
            calculateTotalPrice()
        );
    }
}

interface Discountable {
    double applyDiscount();

    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(
            String itemName,
            double price,
            int quantity) {

        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount for Veg Item.";
    }
}

class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(
            String itemName,
            double price,
            int quantity) {

        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double additionalCharge =
            50 * getQuantity();

        return (getPrice() * getQuantity())
            + additionalCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount for Non-Veg Item.";
    }
}

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(
            new VegItem(
                "Paneer Biryani",
                250,
                2
            )
        );

        order.add(
            new NonVegItem(
                "Chicken Biryani",
                300,
                2
            )
        );

        for (FoodItem item : order) {

            item.getItemDetails();

            Discountable discountable =
                (Discountable) item;

            System.out.println(
                discountable.getDiscountDetails()
            );

            System.out.println(
                "Discount: ₹" +
                discountable.applyDiscount()
            );

            System.out.println("--------------------");
        }
    }
}