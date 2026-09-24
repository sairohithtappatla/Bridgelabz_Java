package coreProgramming.javaMethods.level3;

public class FootballTeamHeights {

    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.print("Player Heights: ");

        for (int height : heights) {
            System.out.print(height + " cm ");
        }

        System.out.println();
        System.out.println("Sum: " + findSum(heights) + " cm");
        System.out.println("Mean: " + findMean(heights) + " cm");
        System.out.println("Shortest: " + findShortest(heights) + " cm");
        System.out.println("Tallest: " + findTallest(heights) + " cm");
    }
}