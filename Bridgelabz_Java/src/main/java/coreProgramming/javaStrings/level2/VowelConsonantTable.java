package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class VowelConsonantTable {

    // Method to identify whether a character is vowel,
    // consonant, or not a letter
    public static String checkCharacterType(char character) {

        // Convert uppercase letter to lowercase using ASCII
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check whether the character is a letter
        if (character >= 'a' && character <= 'z') {

            // Check for vowels
            if (character == 'a'
                    || character == 'e'
                    || character == 'i'
                    || character == 'o'
                    || character == 'u') {

                // Return Vowel
                return "Vowel";
            }

            // Return Consonant
            return "Consonant";
        }

        // Return Not a Letter
        return "Not a Letter";
    }

    // Method to create character-type 2D array
    public static String[][] createCharacterTypeTable(String text) {

        // Create 2D array with character and type columns
        String[][] result = new String[text.length()][2];

        // Process every character
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char character = text.charAt(i);

            // Store the character
            result[i][0] = String.valueOf(character);

            // Store the character type
            result[i][1] = checkCharacterType(character);
        }

        // Return the table
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {

        // Display table header
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        // Display every row
        for (String[] row : table) {

            // Display character and type
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take complete text
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create character-type table
        String[][] table = createCharacterTypeTable(text);

        // Display the table
        displayTable(table);

        // Close Scanner
        input.close();
    }
}
