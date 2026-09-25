package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String firstText, String secondText) {

        // Check if both strings have the same length
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Compare every character at the same index
        for (int i = 0; i < firstText.length(); i++) {

            // Return false if characters are different
            if (firstText.charAt(i) != secondText.charAt(i)) {
                return false;
            }
        }

        // Return true when all characters are equal
        return true;
    }

    // Method to compare two boolean results
    public static boolean compareResults(boolean userDefinedResult, boolean builtInResult) {

        // Return true when both comparison results are the same
        return userDefinedResult == builtInResult;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the first string as input
        System.out.print("Enter first string: ");
        String firstText = input.next();

        // Take the second string as input
        System.out.print("Enter second string: ");
        String secondText = input.next();

        // Compare strings using the user-defined charAt() method
        boolean userDefinedResult = compareUsingCharAt(firstText, secondText);

        // Compare strings using the built-in equals() method
        boolean builtInResult = firstText.equals(secondText);

        // Compare both results
        boolean resultsMatch = compareResults(userDefinedResult, builtInResult);

        // Display the user-defined result
        System.out.println("Result using charAt(): " + userDefinedResult);

        // Display the built-in result
        System.out.println("Result using equals(): " + builtInResult);

        // Display whether both results are the same
        System.out.println("Both results are same: " + resultsMatch);

        // Close Scanner
        input.close();
    }
}
