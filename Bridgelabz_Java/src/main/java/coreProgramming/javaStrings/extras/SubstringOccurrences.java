package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count overlapping occurrences of a substring
    public static int countOccurrences(String text, String substring) {
        // Validate the substring
        if (substring.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Check each possible starting position
        for (int index = 0; index <= text.length() - substring.length(); index++) {
            boolean matches = true;

            // Compare characters of the substring
            for (int subIndex = 0; subIndex < substring.length(); subIndex++) {
                if (text.charAt(index + subIndex) != substring.charAt(subIndex)) {
                    matches = false;
                    break;
                }
            }

            // Increase count when all characters match
            if (matches) {
                count++;
            }
        }

        // Return the total occurrence count
        return count;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the main string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Get the substring to search for
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();

        // Count substring occurrences
        int count = countOccurrences(text, substring);

        // Display the result
        System.out.println("Occurrences: " + count);

        // Close Scanner
        input.close();
    }
}