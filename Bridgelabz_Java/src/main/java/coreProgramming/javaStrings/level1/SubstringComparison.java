package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int startIndex, int endIndex) {

        // Create an empty string to store the substring
        String result = "";

        // Traverse from start index to end index
        for (int i = startIndex; i < endIndex; i++) {

            // Add each character to the result
            result += text.charAt(i);
        }

        // Return the created substring
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String firstText, String secondText) {

        // Check if both strings have the same length
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Compare every character
        for (int i = 0; i < firstText.length(); i++) {

            // Return false if characters are different
            if (firstText.charAt(i) != secondText.charAt(i)) {
                return false;
            }
        }

        // Return true when all characters match
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the string as input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Take the starting index
        System.out.print("Enter start index: ");
        int startIndex = input.nextInt();

        // Take the ending index
        System.out.print("Enter end index: ");
        int endIndex = input.nextInt();

        // Validate the substring indexes
        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {

            // Display an error message for invalid indexes
            System.out.println("Invalid start or end index.");

            // Close Scanner
            input.close();

            // Stop program execution
            return;
        }

        // Create substring using the user-defined charAt() method
        String userDefinedSubstring =
                createSubstring(text, startIndex, endIndex);

        // Create substring using the built-in substring() method
        String builtInSubstring =
                text.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean result =
                compareUsingCharAt(userDefinedSubstring, builtInSubstring);

        // Display the user-defined substring
        System.out.println("Substring using charAt(): "
                + userDefinedSubstring);

        // Display the built-in substring
        System.out.println("Substring using substring(): "
                + builtInSubstring);

        // Display the comparison result
        System.out.println("Both substrings are same: " + result);

        // Close Scanner
        input.close();
    }
}
