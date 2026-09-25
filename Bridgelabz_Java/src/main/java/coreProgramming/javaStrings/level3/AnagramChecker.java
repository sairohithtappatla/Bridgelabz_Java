package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class AnagramChecker {

    // Method to check whether two texts are anagrams
    public static boolean areAnagrams(
            String firstText,
            String secondText) {

        // Check whether lengths are equal
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Create frequency arrays for ASCII characters
        int[] firstFrequency = new int[256];
        int[] secondFrequency = new int[256];

        // Count characters in the first text
        for (int i = 0; i < firstText.length(); i++) {

            // Get current character
            char character = firstText.charAt(i);

            // Increment frequency
            firstFrequency[character]++;
        }

        // Count characters in the second text
        for (int i = 0; i < secondText.length(); i++) {

            // Get current character
            char character = secondText.charAt(i);

            // Increment frequency
            secondFrequency[character]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < firstFrequency.length; i++) {

            // Return false if frequencies differ
            if (firstFrequency[i]
                    != secondFrequency[i]) {

                return false;
            }
        }

        // Return true when all frequencies match
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take first text
        System.out.print("Enter first text: ");
        String firstText = input.nextLine();

        // Take second text
        System.out.print("Enter second text: ");
        String secondText = input.nextLine();

        // Check whether texts are anagrams
        boolean result =
                areAnagrams(
                        firstText,
                        secondText
                );

        // Display result
        if (result) {

            // Display anagram result
            System.out.println(
                    "The two texts are anagrams."
            );

        } else {

            // Display non-anagram result
            System.out.println(
                    "The two texts are not anagrams."
            );
        }

        // Close Scanner
        input.close();
    }
}
