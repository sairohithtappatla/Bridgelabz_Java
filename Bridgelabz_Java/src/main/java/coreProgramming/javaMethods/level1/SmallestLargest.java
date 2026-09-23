package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest number
    public static int[] findSmallestAndLargest(
            int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        // Find smallest
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        // Find largest
        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take three numbers
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        // Find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display result
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        // Close Scanner
        input.close();
    }
}