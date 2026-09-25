package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(
            String text) {

        // Create frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // Count frequency of every character
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char character = text.charAt(i);

            // Increment its ASCII frequency
            frequency[character]++;
        }

        // Find the first character with frequency one
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char character = text.charAt(i);

            // Check whether it occurs only once
            if (frequency[character] == 1) {
                return character;
            }
        }

        // Return null character when no unique character exists
        return '\0';
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take text input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find first non-repeating character
        char result =
                findFirstNonRepeatingCharacter(text);

        // Display the result
        if (result == '\0') {

            // No non-repeating character was found
            System.out.println(
                    "No non-repeating character found."
            );

        } else {

            // Display the first non-repeating character
            System.out.println(
                    "First non-repeating character: " + result
            );
        }

        // Close Scanner
        input.close();
    }
}
