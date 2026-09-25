package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class CustomStringSplit {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        // Initialize the character count
        int count = 0;

        try {

            // Continue until charAt() throws an exception
            while (true) {

                // Access the current character
                text.charAt(count);

                // Increment the count
                count++;
            }

        } catch (StringIndexOutOfBoundsException exception) {

            // Return the calculated length
            return count;
        }
    }

    // Method to count the number of words
    public static int countWords(String text) {

        // Find the string length without using length()
        int textLength = findStringLength(text);

        // Initialize word count
        int wordCount = 0;

        // Track whether the current position is inside a word
        boolean insideWord = false;

        // Traverse every character
        for (int i = 0; i < textLength; i++) {

            // Get the current character
            char character = text.charAt(i);

            // Check whether the character is not a space
            if (character != ' ' && !insideWord) {

                // Start of a new word
                wordCount++;

                // Mark that we are inside a word
                insideWord = true;

            } else if (character == ' ') {

                // Mark that the current word has ended
                insideWord = false;
            }
        }

        // Return the number of words
        return wordCount;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        // Find the number of words
        int wordCount = countWords(text);

        // Create an array to store the words
        String[] words = new String[wordCount];

        // Find the string length
        int textLength = findStringLength(text);

        // Store the starting position of the current word
        int startIndex = 0;

        // Store the word position in the result array
        int wordIndex = 0;

        // Traverse every character and one extra position
        for (int i = 0; i <= textLength; i++) {

            // Check for a space or end of string
            if (i == textLength || text.charAt(i) == ' ') {

                // Create the current word
                if (i > startIndex) {
                    String word = "";

                    // Copy characters of the current word
                    for (int j = startIndex; j < i; j++) {
                        word += text.charAt(j);
                    }

                    // Store the word
                    words[wordIndex] = word;

                    // Move to the next word
                    wordIndex++;
                }

                // Set the start of the next word
                startIndex = i + 1;
            }
        }

        // Return the words
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(
            String[] firstArray,
            String[] secondArray) {

        // Check if both arrays have the same number of words
        if (firstArray.length != secondArray.length) {
            return false;
        }

        // Compare every word
        for (int i = 0; i < firstArray.length; i++) {

            // Return false if a word is different
            if (!firstArray[i].equals(secondArray[i])) {
                return false;
            }
        }

        // Return true when both arrays match
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Split the text using the user-defined method
        String[] userDefinedWords = splitUsingCharAt(text);

        // Split the text using the built-in split() method
        String trimmedText = text.trim();
        String[] builtInWords;

        if (trimmedText.isEmpty()) {
            builtInWords = new String[0];
        } else {
            builtInWords = trimmedText.split("\\s+");
        }

        // Compare both arrays
        boolean result =
                compareArrays(userDefinedWords, builtInWords);

        // Display user-defined words
        System.out.println("Words using charAt():");

        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println(
                "Both results are same: " + result
        );

        // Close Scanner
        input.close();
    }
}
