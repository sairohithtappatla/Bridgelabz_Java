package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String text) {
        // Handle an empty string
        if (text.isEmpty()) {
            return '\0';
        }

        char mostFrequent = text.charAt(0);
        int maximumCount = 0;

        // Check each character as a possible frequent character
        for (int index = 0; index < text.length(); index++) {
            char current = text.charAt(index);
            int count = 0;

            // Count occurrences of the current character
            for (int compareIndex = 0; compareIndex < text.length(); compareIndex++) {
                if (text.charAt(compareIndex) == current) {
                    count++;
                }
            }

            // Update the most frequent character when count is higher
            if (count > maximumCount) {
                maximumCount = count;
                mostFrequent = current;
            }
        }

        // Return the most frequent character
        return mostFrequent;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find and display the most frequent character
        if (text.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            char result = findMostFrequentCharacter(text);
            System.out.println("Most Frequent Character: '" + result + "'");
        }

        // Close Scanner
        input.close();
    }
}