package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerDuckArmstrong {

    // Method to count digits
    public static int countDigits(int number) {

        // Handle zero separately
        if (number == 0) {
            return 1;
        }

        // Initialize digit count
        int count = 0;

        // Count digits
        while (number != 0) {
            number /= 10;
            count++;
        }

        // Return digit count
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigits(int number, int count) {

        // Create digit array
        int[] digits = new int[count];

        // Store absolute value
        number = Math.abs(number);

        // Extract digits from right to left
        for (int i = count - 1; i >= 0; i--) {

            // Store last digit
            digits[i] = number % 10;

            // Remove last digit
            number /= 10;
        }

        // Return digits array
        return digits;
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {

        // Check every digit
        for (int digit : digits) {

            // A zero digit makes the number a Duck Number
            if (digit == 0) {
                return true;
            }
        }

        // No zero found
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {

        // Initialize sum
        int sum = 0;

        // Get number of digits
        int count = digits.length;

        // Calculate Armstrong sum
        for (int digit : digits) {

            // Add digit raised to digit count
            sum += (int) Math.pow(digit, count);
        }

        // Compare sum with original number
        return sum == number;
    }

    // Method to find largest digit
    public static int findLargest(int[] digits) {

        // Initialize largest
        int largest = Integer.MIN_VALUE;

        // Compare all digits
        for (int digit : digits) {

            // Update largest
            if (digit > largest) {
                largest = digit;
            }
        }

        // Return largest
        return largest;
    }

    // Method to find second largest digit
    public static int findSecondLargest(int[] digits) {

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Compare all digits
        for (int digit : digits) {

            // Update largest and second largest
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        // Return second largest
        return secondLargest;
    }

    // Method to find smallest digit
    public static int findSmallest(int[] digits) {

        // Initialize smallest
        int smallest = Integer.MAX_VALUE;

        // Compare all digits
        for (int digit : digits) {

            // Update smallest
            if (digit < smallest) {
                smallest = digit;
            }
        }

        // Return smallest
        return smallest;
    }

    // Method to find second smallest digit
    public static int findSecondSmallest(int[] digits) {

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Compare all digits
        for (int digit : digits) {

            // Update smallest and second smallest
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        // Return second smallest
        return secondSmallest;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Enter a non-negative number.");
            input.close();
            return;
        }

        // Count digits
        int count = countDigits(number);

        // Store digits
        int[] digits = getDigits(number, count);

        // Display digits
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        // Check Duck Number
        boolean duck = isDuckNumber(digits);

        // Check Armstrong Number
        boolean armstrong = isArmstrongNumber(number, digits);

        // Display results
        System.out.println("\nDuck Number: " + duck);
        System.out.println("Armstrong Number: " + armstrong);
        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Second Largest Digit: " + findSecondLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
        System.out.println("Second Smallest Digit: " + findSecondSmallest(digits));

        // Close Scanner
        input.close();
    }
}