package coreProgramming.javaControlFlow.level1;

public class SpringSeason {
    public static void main(String[] args) {

        // Check whether command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide month and day.");
            return;
        }

        // Get month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check whether date falls between March 20 and June 20
        boolean isSpringSeason =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        // Display result
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
