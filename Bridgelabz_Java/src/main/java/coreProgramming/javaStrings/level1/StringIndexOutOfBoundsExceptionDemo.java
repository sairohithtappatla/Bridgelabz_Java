package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to intentionally generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Access an index beyond the string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to demonstrate handling the exception
    public static void handleException(String text) {

        try {

            // Access an index beyond the string length
            System.out.println(text.charAt(text.length()));

        } catch (StringIndexOutOfBoundsException exception) {

            // Handle the StringIndexOutOfBoundsException
            System.out.println(
                    "StringIndexOutOfBoundsException handled."
            );

        } catch (RuntimeException exception) {

            // Handle any other runtime exception
            System.out.println(
                    "RuntimeException handled: "
                            + exception.getClass().getSimpleName()
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the string as input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        try {

            // Call the method that generates the exception
            generateException(text);

        } catch (StringIndexOutOfBoundsException exception) {

            // Catch the intentionally generated exception
            System.out.println(
                    "StringIndexOutOfBoundsException generated and caught."
            );
        }

        // Call the method that handles the exception
        handleException(text);

        // Close Scanner
        input.close();
    }
}
