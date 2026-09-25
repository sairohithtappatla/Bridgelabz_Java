package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to intentionally generate NumberFormatException
    public static void generateException(String text) {

        // Convert the input text into an integer
        int number = Integer.parseInt(text);

        // Display the converted number
        System.out.println("Number: " + number);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleException(String text) {

        try {

            // Convert the input text into an integer
            int number = Integer.parseInt(text);

            // Display the converted number
            System.out.println("Converted number: " + number);

        } catch (NumberFormatException exception) {

            // Handle NumberFormatException
            System.out.println(
                    "NumberFormatException handled."
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

        // Take the input as a String
        System.out.print("Enter a number as text: ");
        String text = input.nextLine();

        try {

            // Call the method that generates the exception
            generateException(text);

        } catch (NumberFormatException exception) {

            // Catch the intentionally generated exception
            System.out.println(
                    "NumberFormatException generated and caught."
            );
        }

        // Call the method that handles the exception
        handleException(text);

        // Close Scanner
        input.close();
    }
}
