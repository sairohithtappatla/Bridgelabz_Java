package coreProgramming.javaMethods.level1;

import java.util.Scanner;

public class SpringSeason {

    // Method to check whether date falls in spring season
    public static boolean isSpringSeason(int month, int day) {

        // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true;
        }

        if (month == 4 || month == 5) {
            return true;
        }

        if (month == 6 && day <= 20) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take month and day
        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        // Validate input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.err.println("Invalid date.");
            input.close();
            return;
        }

        // Check spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close Scanner
        input.close();
    }
}