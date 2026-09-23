package coreProgramming.javaMethods.level2;

import java.util.Scanner;

public class YoungestTallest {

    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {

        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(double[] heights) {

        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {

            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.err.println("Invalid input.");
                input.close();
                return;
            }
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println(
            "Youngest friend: " + names[youngestIndex]
        );

        System.out.println(
            "Tallest friend: " + names[tallestIndex]
        );

        input.close();
    }
}