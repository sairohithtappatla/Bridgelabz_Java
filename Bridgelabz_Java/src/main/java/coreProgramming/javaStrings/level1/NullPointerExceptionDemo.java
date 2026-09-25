package dataStructure.javaStrings.level1;

public class NullPointerExceptionDemo {

    // Method to intentionally generate NullPointerException
    public static void generateException() {

        // Initialize the String reference with null
        String text = null;

        // Access a String method using the null reference
        System.out.println(text.length());
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {

        // Initialize the String reference with null
        String text = null;

        try {

            // Access a String method using the null reference
            System.out.println(text.length());

        } catch (NullPointerException exception) {

            // Handle the NullPointerException
            System.out.println(
                    "NullPointerException handled: "
                            + exception.getMessage()
            );
        }
    }

    public static void main(String[] args) {

        try {

            // Call the method that generates the exception
            generateException();

        } catch (NullPointerException exception) {

            // Catch the intentionally generated exception
            System.out.println(
                    "NullPointerException generated and caught."
            );
        }

        // Call the method that handles the exception
        handleException();
    }
}
