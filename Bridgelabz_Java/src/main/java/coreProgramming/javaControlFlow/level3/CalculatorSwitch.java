package coreProgramming.javaControlFlow.level3;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get first number
        double first = input.nextDouble();

        // Get second number
        double second = input.nextDouble();

        // Get operator
        String op = input.next();

        // Perform operation using switch-case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        // Close Scanner
        input.close();
    }
}