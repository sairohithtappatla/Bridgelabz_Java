package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class VowelConsonantCount {

    // Method to identify whether a character is a vowel,
    // consonant, or not a letter
    public static String checkCharacterType(char character) {

        // Convert uppercase letter to lowercase using ASCII
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check whether the character is a lowercase letter
        if (character >= 'a' && character <= 'z') {

            // Check whether the character is a vowel
            if (character == 'a'
                    || character == 'e'
                    || character == 'i'
                    || character == 'o'
                    || character == 'u') {

                // Return Vowel
                return "Vowel";
            }

            // Return Consonant for other letters
            return "Consonant";
        }

        // Return Not a Letter for non-alphabetic characters
        return "Not a Letter";
    }

    // Method to find vowel and consonant counts
    public static int[] findVowelConsonantCount(String text) {

        // Initialize vowel count
        int vowelCount = 0;

        // Initialize consonant count
        int consonantCount = 0;

        // Traverse every character
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char character = text.charAt(i);

            // Identify character type
            String type = checkCharacterType(character);

            // Increment vowel count
            if (type.equals("Vowel")) {
                vowelCount++;

            // Increment consonant count
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return both counts
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take complete text
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find vowel and consonant counts
        int[] counts = findVowelConsonantCount(text);

        // Display vowel count
        System.out.println("Vowels: " + counts[0]);

        // Display consonant count
        System.out.println("Consonants: " + counts[1]);

        // Close Scanner
        input.close();
    }
}
