package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters while preserving first occurrences
    public static String removeDuplicates(String text) {
        String result = "";

        // Check each character in the input string
        for (int index = 0; index < text.length(); index++) {
            char current = text.charAt(index);
            boolean alreadyPresent = false;

            // Check whether the character is already in the result
            for (int resultIndex = 0; resultIndex < result.length(); resultIndex++) {
                if (result.charAt(resultIndex) == current) {
                    alreadyPresent = true;
                    break;
                }
            }

            // Add the character only if it is not already present
            if (!alreadyPresent) {
                result += current;
            }
        }

        // Return the string without duplicate characters
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Remove duplicate characters
        String result = removeDuplicates(text);

        // Display the modified string
        System.out.println("Modified String: " + result);

        // Close Scanner
        input.close();
    }
}