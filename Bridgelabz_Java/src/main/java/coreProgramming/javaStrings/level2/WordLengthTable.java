package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class WordLengthTable {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        // Initialize character count
        int count = 0;

        try {

            // Access characters until exception occurs
            while (true) {
                text.charAt(count);
                count++;
            }

        } catch (StringIndexOutOfBoundsException exception) {

            // Return calculated length
            return count;
        }
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        // Find text length
        int textLength = findStringLength(text);

        // Count the number of words
        int wordCount = 0;
        boolean insideWord = false;

        for (int i = 0; i < textLength; i++) {

            // Get current character
            char character = text.charAt(i);

            // Detect the beginning of a word
            if (character != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;

            } else if (character == ' ') {

                // Detect the end of a word
                insideWord = false;
            }
        }

        // Create the word array
        String[] words = new String[wordCount];

        // Initialize word extraction variables
        int wordIndex = 0;
        int startIndex = 0;

        // Extract each word
        for (int i = 0; i <= textLength; i++) {

            // Check for space or end of string
            if (i == textLength || text.charAt(i) == ' ') {

                // Extract only when the word is not empty
                if (i > startIndex) {

                    // Create an empty word
                    String word = "";

                    // Copy each character into the word
                    for (int j = startIndex; j < i; j++) {
                        word += text.charAt(j);
                    }

                    // Store the word
                    words[wordIndex] = word;

                    // Move to the next array position
                    wordIndex++;
                }

                // Set starting position for the next word
                startIndex = i + 1;
            }
        }

        // Return the word array
        return words;
    }

    // Method to create word and length 2D array
    public static String[][] createWordLengthTable(String[] words) {

        // Create a 2D array with two columns
        String[][] result = new String[words.length][2];

        // Process every word
        for (int i = 0; i < words.length; i++) {

            // Store the word
            result[i][0] = words[i];

            // Find the word length without using length()
            int wordLength = findStringLength(words[i]);

            // Convert length into String using String.valueOf()
            result[i][1] = String.valueOf(wordLength);
        }

        // Return the 2D result
        return result;
    }

    // Method to display the word length table
    public static void displayTable(String[][] table) {

        // Display the table header
        System.out.println("\nWord\tLength");

        // Display each word and its length
        for (String[] row : table) {

            // Convert String length back to Integer
            int length = Integer.parseInt(row[1]);

            // Display the row
            System.out.println(row[0] + "\t" + length);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Split the sentence into words
        String[] words = splitUsingCharAt(text);

        // Create the word-length table
        String[][] table = createWordLengthTable(words);

        // Display the table
        displayTable(table);

        // Close Scanner
        input.close();
    }
}
