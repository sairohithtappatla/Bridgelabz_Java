package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class StringTrimComparison {

    // Method to find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {

        // Find the text length
        int textLength = text.length();

        // Initialize start index
        int startIndex = 0;

        // Initialize end index
        int endIndex = textLength - 1;

        // Find the first non-space character
        while (startIndex < textLength
                && text.charAt(startIndex) == ' ') {

            // Move start index forward
            startIndex++;
        }

        // Find the last non-space character
        while (endIndex >= startIndex
                && text.charAt(endIndex) == ' ') {

            // Move end index backward
            endIndex--;
        }

        // Return start index and end index
        return new int[]{startIndex, endIndex};
    }

    // Method to create substring using charAt()
    public static String createSubstring(
            String text,
            int startIndex,
            int endIndex) {

        // Create an empty result
        String result = "";

        // Copy characters from start to end
        for (int i = startIndex; i <= endIndex; i++) {

            // Add current character
            result += text.charAt(i);
        }

        // Return trimmed substring
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(
            String firstText,
            String secondText) {

        // Compare string lengths
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < firstText.length(); i++) {

            // Return false when characters differ
            if (firstText.charAt(i) != secondText.charAt(i)) {
                return false;
            }
        }

        // Return true when strings match
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take text with spaces
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = input.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Create user-defined trimmed text
        String userDefinedTrimmedText;

        // Handle the case where the string contains only spaces
        if (indexes[0] > indexes[1]) {
            userDefinedTrimmedText = "";
        } else {

            // Create substring using charAt()
            userDefinedTrimmedText =
                    createSubstring(
                            text,
                            indexes[0],
                            indexes[1]
                    );
        }

        // Trim using the built-in trim() method
        String builtInTrimmedText = text.trim();

        // Compare both results
        boolean result =
                compareStrings(
                        userDefinedTrimmedText,
                        builtInTrimmedText
                );

        // Display user-defined result
        System.out.println(
                "Trimmed using charAt(): "
                        + userDefinedTrimmedText
        );

        // Display built-in result
        System.out.println(
                "Trimmed using trim(): "
                        + builtInTrimmedText
        );

        // Display comparison result
        System.out.println("Both results are same: " + result);

        // Close Scanner
        input.close();
    }
}
