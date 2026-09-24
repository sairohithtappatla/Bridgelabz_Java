package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerHarshad {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    public static int findDigitSum(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static int findSquareDigitSum(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {

        if (number <= 0) {
            return false;
        }

        int sum = findDigitSum(digits);

        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < frequency.length; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Sum of digits: "
                + findDigitSum(digits));

        System.out.println("Sum of squares of digits: "
                + findSquareDigitSum(digits));

        System.out.println("Harshad Number: "
                + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                    frequency[i][0] + " -> " + frequency[i][1]
                );
            }
        }

        input.close();
    }
}