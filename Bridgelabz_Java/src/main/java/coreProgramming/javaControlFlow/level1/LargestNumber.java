package coreProgramming.javaControlFlow.level1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get three numbers
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        // Check whether each number is the largest
        boolean firstLargest = number1 >= number2 && number1 >= number3;
        boolean secondLargest = number2 >= number1 && number2 >= number3;
        boolean thirdLargest = number3 >= number1 && number3 >= number2;

        // Display results
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        // Close Scanner
        input.close();
    }
}
