package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class YoungestTallest {

    // Method to find the youngest age
    public static int findYoungest(int[] ages) {

        // Assume first age is the youngest
        int youngest = ages[0];

        // Compare remaining ages
        for (int age : ages) {

            // Update youngest when a smaller age is found
            if (age < youngest) {
                youngest = age;
            }
        }

        // Return youngest age
        return youngest;
    }

    // Method to find the tallest height
    public static double findTallest(double[] heights) {

        // Assume first height is the tallest
        double tallest = heights[0];

        // Compare remaining heights
        for (double height : heights) {

            // Update tallest when a greater height is found
            if (height > tallest) {
                tallest = height;
            }
        }

        // Return tallest height
        return tallest;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create arrays for ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Get age and height values
        for (int i = 0; i < ages.length; i++) {

            // Get age
            System.out.print("Enter age of person " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Get height
            System.out.print("Enter height of person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();

            // Validate age and height
            if (ages[i] < 0 || heights[i] < 0) {
                System.out.println("Age and height cannot be negative.");
                input.close();
                return;
            }
        }

        // Find youngest age
        int youngest = findYoungest(ages);

        // Find tallest height
        double tallest = findTallest(heights);

        // Display results
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);

        // Close Scanner
        input.close();
    }
}
