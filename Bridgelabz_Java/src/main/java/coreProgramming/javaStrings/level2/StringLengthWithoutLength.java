package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class StringLengthWithoutLength {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        // Initialize the character count
        int count = 0;

        try {

            // Continue until charAt() throws an exception
            while (true) {

                // Access the current character
                text.charAt(count);

                // Increment the character count
                count++;
            }

        } catch (StringIndexOutOfBoundsException exception) {

            // Exception indicates that the end of the string was reached
            return count;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the string as input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Find length using the user-defined method
        int userDefinedLength = findStringLength(text);

        // Find length using the built-in length() method
        int builtInLength = text.length();

        // Display the user-defined length
        System.out.println(
                "Length using user-defined method: "
                        + userDefinedLength
        );

        // Display the built-in length
        System.out.println(
                "Length using length(): "
                        + builtInLength
        );

        // Compare both results
        System.out.println(
                "Both lengths are same: "
                        + (userDefinedLength == builtInLength)
        );

        // Close Scanner
        input.close();
    }
}
