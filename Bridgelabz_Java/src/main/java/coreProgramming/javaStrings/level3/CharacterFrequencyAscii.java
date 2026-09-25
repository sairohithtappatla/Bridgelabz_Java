package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class CharacterFrequencyAscii {

    // Method to find character frequencies using charAt()
    public static String[][] findCharacterFrequency(
            String text) {

        // Create frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char character = text.charAt(i);

            // Increment the ASCII frequency
            frequency[character]++;
        }

        // Count the number of characters that occur
        int uniqueCount = 0;

        // Check every ASCII character
        for (int i = 0; i < frequency.length; i++) {

            // Count characters having a non-zero frequency
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array for characters and frequencies
        String[][] result =
                new String[uniqueCount][2];

        // Store the result index
        int resultIndex = 0;

        // Traverse ASCII frequencies
        for (int i = 0; i < frequency.length; i++) {

            // Store only characters that occurred
            if (frequency[i] > 0) {

                // Store the character
                result[resultIndex][0] =
                        String.valueOf((char) i);

                // Store its frequency
                result[resultIndex][1] =
                        String.valueOf(frequency[i]);

                // Move to next result position
                resultIndex++;
            }
        }

        // Return character frequencies
        return result;
    }

    // Method to display character frequencies
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

        // Display each character and frequency
        for (String[] row : frequencyTable) {

            // Display current row
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

        // Find character frequencies
        String[][] frequencyTable =
                findCharacterFrequency(text);

        // Display frequencies
        displayFrequency(frequencyTable);

        // Close Scanner
        input.close();
    }
}
