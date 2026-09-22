package coreProgramming.javaArrays.level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create array to store heights of 11 players
        double[] heights = new double[11];

        // Take height input for all players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        // Calculate sum of heights
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display mean height
        System.out.println("Mean height: " + mean);

        // Close Scanner
        input.close();
    }
}