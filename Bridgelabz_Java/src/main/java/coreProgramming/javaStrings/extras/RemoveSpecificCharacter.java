package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove all occurrences of a specified character
    public static String removeCharacter(String text, char characterToRemove) {
        String result = "";

        // Check each character in the input string
        for (int index = 0; index < text.length(); index++) {
            char current = text.charAt(index);

            // Keep the character only if it is not the target character
            if (current != characterToRemove) {
                result += current;
            }
        }

        // Return the modified string
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Get the character to remove
        System.out.print("Character to Remove: ");
        String characterInput = input.nextLine();

        // Validate the character input
        if (characterInput.isEmpty()) {
            System.out.println("Please enter a character.");
        } else {
            // Remove the specified character
            char characterToRemove = characterInput.charAt(0);
            String result = removeCharacter(text, characterToRemove);

            // Display the modified string
            System.out.println("Modified String: " + result);
        }

        // Close Scanner
        input.close();
    }
}