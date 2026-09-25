package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        // Initialize character count
        int count = 0;

        try {

            // Access characters until the end is reached
            while (true) {
                text.charAt(count);
                count++;
            }

        } catch (StringIndexOutOfBoundsException exception) {

            // Return the calculated length
            return count;
        }
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        // Find the length without using length()
        int textLength = findStringLength(text);

        // Create an array with maximum possible size
        char[] temporaryCharacters =
                new char[textLength];

        // Store the number of unique characters
        int uniqueCount = 0;

        // Traverse every character
        for (int i = 0; i < textLength; i++) {

            // Get the current character
            char currentCharacter = text.charAt(i);

            // Assume the character is unique
            boolean isUnique = true;

            // Compare with previously stored characters
            for (int j = 0; j < uniqueCount; j++) {

                // Check whether the character already exists
                if (temporaryCharacters[j] == currentCharacter) {
                    isUnique = false;
                    break;
                }
            }

            // Store character if it is unique
            if (isUnique) {
                temporaryCharacters[uniqueCount] =
                        currentCharacter;
                uniqueCount++;
            }
        }

        // Create an array with exact unique-character size
        char[] uniqueCharacters =
                new char[uniqueCount];

        // Copy unique characters into the final array
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] =
                    temporaryCharacters[i];
        }

        // Return unique characters
        return uniqueCharacters;
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

        // Display unique characters
        System.out.print("Unique characters: ");

        // Traverse the result
        for (char character : uniqueCharacters) {
            System.out.print(character + " ");
        }

        // Move to next line
        System.out.println();

        // Close Scanner
        input.close();
    }
}
