package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class PalindromeCheck {

    // Method to check whether a string is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            // Return false when characters do not match
            if (Character.toLowerCase(text.charAt(start))
                    != Character.toLowerCase(text.charAt(end))) {
                return false;
            }

            // Move toward the center
            start++;
            end--;
        }

        // All corresponding characters matched
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Check whether the string is a palindrome
        if (isPalindrome(text)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close Scanner
        input.close();
    }
}