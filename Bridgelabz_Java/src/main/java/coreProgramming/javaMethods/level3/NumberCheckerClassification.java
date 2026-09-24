package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerClassification {

    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2];
    }

    public static int findFactorSum(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long findFactorProduct(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static long findProductOfFactorCubes(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= (long) Math.pow(factor, 3);
        }

        return product;
    }

    public static int findProperDivisorSum(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }

        return sum;
    }

    public static boolean isPerfectNumber(int number, int[] factors) {
        return findProperDivisorSum(factors) == number;
    }

    public static boolean isAbundantNumber(int number, int[] factors) {
        return findProperDivisorSum(factors) > number;
    }

    public static boolean isDeficientNumber(int number, int[] factors) {
        return findProperDivisorSum(factors) < number;
    }

    public static int factorial(int digit) {

        int result = 1;

        for (int i = 2; i <= digit; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean isStrongNumber(int number) {

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number.");
            input.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();
        System.out.println("Greatest Proper Factor: "
                + findGreatestFactor(factors));
        System.out.println("Factor Sum: "
                + findFactorSum(factors));
        System.out.println("Factor Product: "
                + findFactorProduct(factors));
        System.out.println("Product of Cubes: "
                + findProductOfFactorCubes(factors));
        System.out.println("Perfect: "
                + isPerfectNumber(number, factors));
        System.out.println("Abundant: "
                + isAbundantNumber(number, factors));
        System.out.println("Deficient: "
                + isDeficientNumber(number, factors));
        System.out.println("Strong: "
                + isStrongNumber(number));

        input.close();
    }
}