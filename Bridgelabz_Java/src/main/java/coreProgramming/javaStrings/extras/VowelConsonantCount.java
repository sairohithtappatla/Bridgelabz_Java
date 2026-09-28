package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class VowelConsonantCount {

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Check each character in the string
        for (int index = 0; index < text.length(); index++) {
            char character = Character.toLowerCase(text.charAt(index));

            // Count only alphabetic characters
            if (character >= 'a' && character <= 'z') {
                // Check whether the character is a vowel
                if (character == 'a' || character == 'e' || character == 'i'
                        || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Return vowel and consonant counts
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Calculate vowel and consonant counts
        int[] counts = countVowelsAndConsonants(text);

        // Display the results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        // Close Scanner
        input.close();
    }
}