package coreProgramming;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average = " + average);

        scanner.close();
    }
}