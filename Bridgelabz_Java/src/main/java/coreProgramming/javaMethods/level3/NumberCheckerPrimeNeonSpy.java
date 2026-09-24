package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class NumberCheckerPrimeNeonSpy {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int digitSum(int number) {

        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }

    public static int digitProduct(int number) {

        if (number == 0) {
            return 0;
        }

        int product = 1;
        int temp = Math.abs(number);

        while (temp > 0) {
            product *= temp % 10;
            temp /= 10;
        }

        return product;
    }

    public static boolean isNeonNumber(int number) {

        int square = number * number;

        return digitSum(square) == number;
    }

    public static boolean isSpyNumber(int number) {

        return digitSum(number) == digitProduct(number);
    }

    public static boolean isAutomorphicNumber(int number) {

        int square = number * number;
        int divisor = 1;
        int temp = number;

        if (temp == 0) {
            return true;
        }

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        return square % divisor == number;
    }

    public static boolean isBuzzNumber(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeonNumber(number));
        System.out.println("Spy: " + isSpyNumber(number));
        System.out.println("Automorphic: " + isAutomorphicNumber(number));
        System.out.println("Buzz: " + isBuzzNumber(number));

        input.close();
    }
}