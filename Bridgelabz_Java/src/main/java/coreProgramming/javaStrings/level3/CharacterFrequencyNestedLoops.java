package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findCharacterFrequency(
            String text) {

        // Convert the text into a character array
        char[] characters = text.toCharArray();

        // Create frequency array
        int[] frequency =
                new int[characters.length];

        // Initialize every frequency to 1
        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;
        }

        // Use nested loops to find duplicates
        for (int i = 0; i < characters.length; i++) {

            // Skip characters already marked as duplicate
            if (characters[i] == '0') {
                continue;
            }

            // Compare current character with remaining characters
            for (int j = i + 1;
                 j < characters.length;
                 j++) {

                // Check whether characters are equal
                if (characters[i] == characters[j]) {

                    // Increment frequency
                    frequency[i]++;

                    // Mark duplicate character
                    characters[j] = '0';
                }
            }
        }

        // Count non-duplicate characters
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {

            // Count valid characters
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create result array
        String[] result =
                new String[uniqueCount];

        // Store result index
        int resultIndex = 0;

        // Store characters and frequencies
        for (int i = 0; i < characters.length; i++) {

            // Skip duplicate markers
            if (characters[i] != '0') {

                // Store character and frequency
                result[resultIndex] =
                        characters[i]
                                + " : "
                                + frequency[i];

                // Move to next result position
                resultIndex++;
            }
        }

        // Return frequency result
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take text input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find frequencies using nested loops
        String[] result =
                findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequencies:");

        // Display every frequency
        for (String frequency : result) {
            System.out.println(frequency);
        }

        // Close Scanner
        input.close();
    }
}
