package coreProgramming.javaArrays.level2;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Store friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Create arrays for age and height
        int[] ages = new int[names.length];
        double[] heights = new double[names.length];

        // Take input
        for (int i = 0; i < names.length; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();

            // Validate input
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }

        // Assume first friend is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < ages.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        // Close Scanner
        input.close();
    }
}