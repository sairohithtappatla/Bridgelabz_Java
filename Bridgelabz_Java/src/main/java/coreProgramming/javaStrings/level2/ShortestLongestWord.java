package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without using length()
    public static int findStringLength(String text) {

        // Initialize the count
        int count = 0;

        try {

            // Continue until charAt() throws an exception
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

        // Count words
        int wordCount = 0;
        boolean insideWord = false;

        for (int i = 0; i < textLength; i++) {

            // Read current character
            char character = text.charAt(i);

            // Detect start of a word
            if (character != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;

            } else if (character == ' ') {

                // Detect end of a word
                insideWord = false;
            }
        }

        // Create word array
        String[] words = new String[wordCount];

        // Initialize extraction variables
        int wordIndex = 0;
        int startIndex = 0;

        // Extract every word
        for (int i = 0; i <= textLength; i++) {

            // Check for space or end
            if (i == textLength || text.charAt(i) == ' ') {

                // Extract non-empty word
                if (i > startIndex) {

                    // Create empty word
                    String word = "";

                    // Copy characters
                    for (int j = startIndex; j < i; j++) {
                        word += text.charAt(j);
                    }

                    // Store word
                    words[wordIndex] = word;

                    // Move to next word
                    wordIndex++;
                }

                // Set next starting index
                startIndex = i + 1;
            }
        }

        // Return the words
        return words;
    }

    // Method to create word and length 2D array
    public static String[][] createWordLengthTable(String[] words) {

        // Create result array
        String[][] result = new String[words.length][2];

        // Store each word and its length
        for (int i = 0; i < words.length; i++) {

            // Store word
            result[i][0] = words[i];

            // Store word length as String
            result[i][1] =
                    String.valueOf(findStringLength(words[i]));
        }

        // Return result
        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] table) {

        // Initialize indexes
        int shortestIndex = 0;
        int longestIndex = 0;

        // Traverse all words
        for (int i = 1; i < table.length; i++) {

            // Convert current word length to Integer
            int currentLength = Integer.parseInt(table[i][1]);

            // Convert shortest word length to Integer
            int shortestLength =
                    Integer.parseInt(table[shortestIndex][1]);

            // Convert longest word length to Integer
            int longestLength =
                    Integer.parseInt(table[longestIndex][1]);

            // Update shortest word
            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            // Update longest word
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        // Return shortest and longest indexes
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take complete text
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitUsingCharAt(text);

        // Validate that at least one word exists
        if (words.length == 0) {

            // Display an error message
            System.out.println("No words found.");

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Create word-length table
        String[][] table = createWordLengthTable(words);

        // Find shortest and longest word indexes
        int[] indexes = findShortestLongest(table);

        // Get shortest word
        String shortestWord = table[indexes[0]][0];

        // Get longest word
        String longestWord = table[indexes[1]][0];

        // Display shortest word
        System.out.println("Shortest word: " + shortestWord);

        // Display longest word
        System.out.println("Longest word: " + longestWord);

        // Close Scanner
        input.close();
    }
}
