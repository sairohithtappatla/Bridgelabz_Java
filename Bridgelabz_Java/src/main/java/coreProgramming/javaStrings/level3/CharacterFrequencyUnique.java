package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(
            String text) {

        // Create temporary array with maximum size
        char[] temporaryCharacters =
                new char[text.length()];

        // Track number of unique characters
        int uniqueCount = 0;

        // Traverse every character
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char currentCharacter =
                    text.charAt(i);

            // Assume character is unique
            boolean isUnique = true;

            // Compare with previous unique characters
            for (int j = 0; j < uniqueCount; j++) {

                // Check whether character already exists
                if (temporaryCharacters[j]
                        == currentCharacter) {

                    // Mark character as duplicate
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                temporaryCharacters[uniqueCount] =
                        currentCharacter;
                uniqueCount++;
            }
        }

        // Create final array with exact size
        char[] uniqueCharacters =
                new char[uniqueCount];

        // Copy unique characters
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] =
                    temporaryCharacters[i];
        }

        // Return unique characters
        return uniqueCharacters;
    }

    // Method to find frequency of unique characters
    public static String[][] findCharacterFrequency(
            String text,
            char[] uniqueCharacters) {

        // Create result table
        String[][] result =
                new String[uniqueCharacters.length][2];

        // Process every unique character
        for (int i = 0; i < uniqueCharacters.length; i++) {

            // Get current unique character
            char currentCharacter =
                    uniqueCharacters[i];

            // Initialize frequency
            int frequency = 0;

            // Count occurrences in the text
            for (int j = 0; j < text.length(); j++) {

                // Check for matching character
                if (text.charAt(j)
                        == currentCharacter) {

                    // Increment frequency
                    frequency++;
                }
            }

            // Store character
            result[i][0] =
                    String.valueOf(currentCharacter);

            // Store frequency
            result[i][1] =
                    String.valueOf(frequency);
        }

        // Return frequency table
        return result;
    }

    // Method to display frequency table
    public static void displayFrequency(
            String[][] frequencyTable) {

        // Display table header
        System.out.println(
                "\nCharacter\tFrequency"
        );

        // Display separator
        System.out.println(
                "-----------------------"
        );

        // Display every row
        for (String[] row : frequencyTable) {

            // Display character and frequency
            System.out.println(
                    row[0] + "\t\t" + row[1]
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take text input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueCharacters =
                findUniqueCharacters(text);

        // Find frequency of unique characters
        String[][] frequencyTable =
                findCharacterFrequency(
                        text,
                        uniqueCharacters
                );

        // Display the frequency table
        displayFrequency(frequencyTable);

        // Close Scanner
        input.close();
    }
}
