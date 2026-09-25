package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class PalindromeThreeMethods {

    // Method 1: Check palindrome using start and end indexes
    public static boolean checkPalindromeUsingLoop(
            String text) {

        // Initialize start index
        int startIndex = 0;

        // Initialize end index
        int endIndex = text.length() - 1;

        // Compare characters from both ends
        while (startIndex < endIndex) {

            // Return false if characters do not match
            if (text.charAt(startIndex)
                    != text.charAt(endIndex)) {

                return false;
            }

            // Move start index forward
            startIndex++;

            // Move end index backward
            endIndex--;
        }

        // Return true when all characters match
        return true;
    }

    // Method 2: Check palindrome recursively
    public static boolean checkPalindromeUsingRecursion(
            String text,
            int startIndex,
            int endIndex) {

        // Base condition when indexes meet
        if (startIndex >= endIndex) {
            return true;
        }

        // Return false if characters differ
        if (text.charAt(startIndex)
                != text.charAt(endIndex)) {

            return false;
        }

        // Recursively check inner characters
        return checkPalindromeUsingRecursion(
                text,
                startIndex + 1,
                endIndex - 1
        );
    }

    // Method to reverse string using charAt()
    public static char[] reverseUsingCharAt(
            String text) {

        // Create reverse character array
        char[] reverse =
                new char[text.length()];

        // Copy characters in reverse order
        for (int i = 0; i < text.length(); i++) {

            // Store character at reverse position
            reverse[i] =
                    text.charAt(text.length() - 1 - i);
        }

        // Return reverse array
        return reverse;
    }

    // Method 3: Check palindrome using character arrays
    public static boolean checkPalindromeUsingArrays(
            String text) {

        // Convert original string into character array
        char[] original =
                text.toCharArray();

        // Create reverse array using charAt()
        char[] reverse =
                reverseUsingCharAt(text);

        // Compare original and reverse arrays
        for (int i = 0; i < original.length; i++) {

            // Return false if characters differ
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        // Return true when arrays are equal
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take text input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Check palindrome using loop
        boolean loopResult =
                checkPalindromeUsingLoop(text);

        // Check palindrome using recursion
        boolean recursiveResult =
                checkPalindromeUsingRecursion(
                        text,
                        0,
                        text.length() - 1
                );

        // Check palindrome using character arrays
        boolean arrayResult =
                checkPalindromeUsingArrays(text);

        // Display result of method 1
        System.out.println(
                "Palindrome using loop: "
                        + loopResult
        );

        // Display result of method 2
        System.out.println(
                "Palindrome using recursion: "
                        + recursiveResult
        );

        // Display result of method 3
        System.out.println(
                "Palindrome using character arrays: "
                        + arrayResult
        );

        // Close Scanner
        input.close();
    }
}
