package dataStructure.javaStrings.extras;

import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string without a built-in reverse function
    public static String reverse(String text) {
        String reversed = "";

        // Read characters from the end to the beginning
        for (int index = text.length() - 1; index >= 0; index--) {
            reversed += text.charAt(index);
        }

        // Return the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Reverse the string
        String reversed = reverse(text);

        // Display the result
        System.out.println("Reversed String: " + reversed);

        // Close Scanner
        input.close();
    }
}