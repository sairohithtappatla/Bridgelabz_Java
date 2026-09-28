package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using whitespace
        String[] words = sentence.trim().split("\\s+");
        String longestWord = "";

        // Check the length of each word
        for (String word : words) {
            // Ignore empty entries and update the longest word
            if (!word.isEmpty() && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Return the longest word
        return longestWord;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the result
        if (longestWord.isEmpty()) {
            System.out.println("No word found.");
        } else {
            System.out.println("Longest Word: " + longestWord);
        }

        // Close Scanner
        input.close();
    }
}