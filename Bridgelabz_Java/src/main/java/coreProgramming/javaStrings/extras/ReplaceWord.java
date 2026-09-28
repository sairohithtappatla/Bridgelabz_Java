package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class ReplaceWord {

    // Method to check whether a word matches at a given position
    private static boolean matchesAt(String sentence, String word, int position) {
        // Check whether the complete word fits at this position
        if (position + word.length() > sentence.length()) {
            return false;
        }

        // Compare each character of the word
        for (int index = 0; index < word.length(); index++) {
            if (sentence.charAt(position + index) != word.charAt(index)) {
                return false;
            }
        }

        // All characters match
        return true;
    }

    // Method to identify word boundaries
    private static boolean isWordCharacter(char character) {
        return Character.isLetterOrDigit(character) || character == '_';
    }

    // Method to replace whole-word occurrences in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Return the original sentence if the search word is empty
        if (oldWord.isEmpty()) {
            return sentence;
        }

        String result = "";
        int index = 0;

        // Process the sentence from left to right
        while (index < sentence.length()) {
            // Check whether the old word matches at the current position
            boolean matches = matchesAt(sentence, oldWord, index);

            // Check the character before the possible word
            boolean validStart = index == 0
                    || !isWordCharacter(sentence.charAt(index - 1));

            // Check the character after the possible word
            int endPosition = index + oldWord.length();
            boolean validEnd = endPosition >= sentence.length()
                    || !isWordCharacter(sentence.charAt(endPosition));

            // Replace only when the complete word matches
            if (matches && validStart && validEnd) {
                result += newWord;
                index += oldWord.length();
            } else {
                // Keep the current character and continue
                result += sentence.charAt(index);
                index++;
            }
        }

        // Return the sentence after replacement
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Get the word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = input.nextLine();

        // Get the replacement word
        System.out.print("Enter the new word: ");
        String newWord = input.nextLine();

        // Validate the word to replace
        if (oldWord.isEmpty()) {
            System.out.println("The word to replace cannot be empty.");
        } else {
            // Replace the specified whole word
            String result = replaceWord(sentence, oldWord, newWord);

            // Display the modified sentence
            System.out.println("Modified Sentence: " + result);
        }

        // Close Scanner
        input.close();
    }
}