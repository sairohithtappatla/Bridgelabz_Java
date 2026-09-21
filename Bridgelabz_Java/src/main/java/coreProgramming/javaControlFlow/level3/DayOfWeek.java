package coreProgramming.javaControlFlow.level3;

public class DayOfWeek {
    public static void main(String[] args) {

        // Get month, day and year from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Calculate adjusted year
        int y0 = year - (14 - month) / 12;

        // Calculate year component
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate adjusted month
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of week
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Display day of week
        System.out.println("Day of week: " + d0);
    }
}