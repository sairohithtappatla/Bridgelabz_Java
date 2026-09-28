package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of alphabetic characters
    public static String toggleCase(String text) {
        String result = "";

        // Check each character in the string
        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);

            // Convert uppercase characters to lowercase
            if (Character.isUpperCase(character)) {
                result += Character.toLowerCase(character);
            }
            // Convert lowercase characters to uppercase
            else if (Character.isLowerCase(character)) {
                result += Character.toUpperCase(character);
            }
            // Preserve non-alphabetic characters
            else {
                result += character;
            }
        }

        // Return the toggled string
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Toggle the character cases
        String result = toggleCase(text);

        // Display the result
        System.out.println("Toggled String: " + result);

        // Close Scanner
        input.close();
    }
}