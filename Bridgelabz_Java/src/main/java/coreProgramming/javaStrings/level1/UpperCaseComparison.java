package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCase(String text) {

        // Create an empty string to store the result
        String result = "";

        // Traverse through every character
        for (int i = 0; i < text.length(); i++) {

            // Get the current character
            char character = text.charAt(i);

            // Check whether the character is lowercase
            if (character >= 'a' && character <= 'z') {

                // Convert lowercase character to uppercase using ASCII difference
                character = (char) (character - 32);
            }

            // Add the character to the result
            result += character;
        }

        // Return the converted text
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String firstText, String secondText) {

        // Check if both strings have the same length
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < firstText.length(); i++) {

            // Return false when characters are different
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

        // Take complete text as input
        System.out.print("Enter complete text: ");
        String text = input.nextLine();

        // Convert text using the user-defined charAt() method
        String userDefinedResult = convertToUpperCase(text);

        // Convert text using the built-in toUpperCase() method
        String builtInResult = text.toUpperCase();

        // Compare both results using charAt()
        boolean result =
                compareStrings(userDefinedResult, builtInResult);

        // Display the user-defined result
        System.out.println(
                "Uppercase using charAt(): " + userDefinedResult
        );

        // Display the built-in result
        System.out.println(
                "Uppercase using toUpperCase(): " + builtInResult
        );

        // Display the comparison result
        System.out.println("Both results are same: " + result);

        // Close Scanner
        input.close();
    }
}
