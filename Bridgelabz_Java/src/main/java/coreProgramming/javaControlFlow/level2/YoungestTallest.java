package coreProgramming.javaControlFlow.level2;

import java.util.Scanner;

public class YoungestTallest {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get ages of the three friends
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Get heights of the three friends
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Declare variable for youngest friend
        String youngestFriend;

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngestFriend = "Amar";

        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngestFriend = "Akbar";

        } else {
            youngestFriend = "Anthony";
        }

        // Declare variable for tallest friend
        String tallestFriend;

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallestFriend = "Amar";

        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallestFriend = "Akbar";

        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);

        // Close Scanner
        input.close();
    }
}