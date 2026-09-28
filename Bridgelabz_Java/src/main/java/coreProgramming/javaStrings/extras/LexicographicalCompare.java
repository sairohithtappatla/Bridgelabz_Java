package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings without built-in compare methods
    public static int compareStrings(String first, String second) {
        int minimumLength = Math.min(first.length(), second.length());

        // Compare corresponding characters
        for (int index = 0; index < minimumLength; index++) {
            char firstCharacter = first.charAt(index);
            char secondCharacter = second.charAt(index);

            // Return the difference at the first mismatch
            if (firstCharacter != secondCharacter) {
                return firstCharacter - secondCharacter;
            }
        }

        // If common characters match, compare string lengths
        return first.length() - second.length();
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the first string
        System.out.print("Enter String 1: ");
        String first = input.nextLine();

        // Get the second string
        System.out.print("Enter String 2: ");
        String second = input.nextLine();

        // Compare the strings
        int comparison = compareStrings(first, second);

        // Display the comparison result
        if (comparison < 0) {
            System.out.println("\"" + first + "\" comes before \"" + second
                    + "\" in lexicographical order");
        } else if (comparison > 0) {
            System.out.println("\"" + first + "\" comes after \"" + second
                    + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal.");
        }

        // Close Scanner
        input.close();
    }
}