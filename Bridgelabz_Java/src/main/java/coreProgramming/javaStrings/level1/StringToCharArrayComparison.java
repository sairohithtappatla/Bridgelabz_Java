package dataStructure.javaStrings.level1;

import java.util.Scanner;

public class StringToCharArrayComparison {

    // Method to return all characters without using toCharArray()
    public static char[] getCharacters(String text) {

        // Create a character array with the string length
        char[] characters = new char[text.length()];

        // Traverse through the string
        for (int i = 0; i < text.length(); i++) {

            // Store each character in the array
            characters[i] = text.charAt(i);
        }

        // Return the character array
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] firstArray, char[] secondArray) {

        // Check if both arrays have the same length
        if (firstArray.length != secondArray.length) {
            return false;
        }

        // Compare every character
        for (int i = 0; i < firstArray.length; i++) {

            // Return false when characters are different
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        // Return true when both arrays are equal
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the string as input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Get characters using the user-defined method
        char[] userDefinedCharacters = getCharacters(text);

        // Get characters using the built-in toCharArray() method
        char[] builtInCharacters = text.toCharArray();

        // Compare both character arrays
        boolean result =
                compareArrays(userDefinedCharacters, builtInCharacters);

        // Display the user-defined character array
        System.out.print("Characters using user-defined method: ");

        // Traverse and display each character
        for (char character : userDefinedCharacters) {
            System.out.print(character + " ");
        }

        // Move to the next line
        System.out.println();

        // Display the comparison result
        System.out.println("Both arrays are same: " + result);

        // Close Scanner
        input.close();
    }
}
