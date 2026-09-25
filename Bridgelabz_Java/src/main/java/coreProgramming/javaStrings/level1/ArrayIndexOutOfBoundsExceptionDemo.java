package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to intentionally access an invalid array index
    public static void generateException(String[] names) {

        // Access an index larger than the array length
        System.out.println(names[names.length]);
    }

    // Method to demonstrate handling ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {

            // Access an index larger than the array length
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException exception) {

            // Handle ArrayIndexOutOfBoundsException
            System.out.println(
                    "ArrayIndexOutOfBoundsException handled."
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

        // Ask the user for the number of names
        System.out.print("Enter number of names: ");
        int numberOfNames = input.nextInt();

        // Validate the number of names
        if (numberOfNames <= 0) {

            // Display an error message
            System.out.println("Number of names must be positive.");

            // Close Scanner
            input.close();

            // Stop program execution
            return;
        }

        // Create an array to store names
        String[] names = new String[numberOfNames];

        // Take names from the user
        for (int i = 0; i < names.length; i++) {

            // Ask for each name
            System.out.print("Enter name " + (i + 1) + ": ");

            // Store the name
            names[i] = input.next();
        }

        try {

            // Call the method that generates the exception
            generateException(names);

        } catch (ArrayIndexOutOfBoundsException exception) {

            // Catch the intentionally generated exception
            System.out.println(
                    "ArrayIndexOutOfBoundsException generated and caught."
            );
        }

        // Call the method that handles the exception
        handleException(names);

        // Close Scanner
        input.close();
    }
}
