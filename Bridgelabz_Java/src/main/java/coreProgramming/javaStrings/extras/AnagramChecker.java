package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class AnagramChecker {

    // Method to check whether two strings are anagrams
    // This implementation ignores letter case and whitespace
    public static boolean areAnagrams(String first, String second) {
        // Normalize both strings
        first = first.replaceAll("\\s+", "").toLowerCase();
        second = second.replaceAll("\\s+", "").toLowerCase();

        // Anagrams must have the same number of characters
        if (first.length() != second.length()) {
            return false;
        }

        // Store character frequencies for the first string
        int[] frequency = new int[Character.MAX_VALUE + 1];

        // Increase frequency for each character in the first string
        for (int index = 0; index < first.length(); index++) {
            frequency[first.charAt(index)]++;
        }

        // Decrease frequency for each character in the second string
        for (int index = 0; index < second.length(); index++) {
            frequency[second.charAt(index)]--;

            // A negative frequency means the strings differ
            if (frequency[second.charAt(index)] < 0) {
                return false;
            }
        }

        // All character frequencies match
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the first string
        System.out.print("Enter the first string: ");
        String first = input.nextLine();

        // Get the second string
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        // Check whether the strings are anagrams
        if (areAnagrams(first, second)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close Scanner
        input.close();
    }
}