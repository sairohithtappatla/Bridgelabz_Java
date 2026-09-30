package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level2;

import java.util.Scanner;

public class PalindromeChecker {

    // Instance variable stores the text to be checked
    private String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        setText(text);
    }

    // Getter method to return text
    public String getText() {
        return text;
    }

    // Setter method to update text
    public void setText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null.");
        }
        this.text = text;
    }

    // Method to check whether text is a palindrome
    public boolean isPalindrome() {
        // Ignore spaces and letter case during comparison
        String normalizedText = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalizedText.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (normalizedText.charAt(start) != normalizedText.charAt(end)) {
                return false;
            }

            // Move the indexes toward the center
            start++;
            end--;
        }

        // All compared characters match
        return true;
    }

    // Method to display palindrome result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get text from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Display palindrome result
        checker.displayResult();

        // Close Scanner
        input.close();
    }
}