package coreProgramming.javaMethods.level3;

public class FootballTeamHeights {

    // Generate random heights for all players
    public static int[] generateHeights() {

        // Create an array for 11 players
        int[] heights = new int[11];

        // Generate random height for each player
        for (int i = 0; i < heights.length; i++) {

            // Generate height between 150 and 250 cm
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        // Return the heights array
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int findSum(int[] heights) {

        // Initialize sum
        int sum = 0;

        // Add every height
        for (int height : heights) {
            sum += height;
        }

        // Return the sum
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {

        // Find total height
        int sum = findSum(heights);

        // Calculate mean
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {

        // Assume first height is shortest
        int shortest = heights[0];

        // Compare all heights
        for (int height : heights) {

            // Update shortest height
            if (height < shortest) {
                shortest = height;
            }
        }

        // Return shortest height
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {

        // Assume first height is tallest
        int tallest = heights[0];

        // Compare all heights
        for (int height : heights) {

            // Update tallest height
            if (height > tallest) {
                tallest = height;
            }
        }

        // Return tallest height
        return tallest;
    }

    public static void main(String[] args) {

        // Generate player heights
        int[] heights = generateHeights();

        // Display player heights
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        // Calculate shortest height
        int shortest = findShortest(heights);

        // Calculate tallest height
        int tallest = findTallest(heights);

        // Calculate mean height
        double mean = findMean(heights);

        // Display results
        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }
}