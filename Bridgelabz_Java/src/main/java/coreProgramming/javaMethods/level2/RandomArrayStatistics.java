package coreProgramming.javaMethods.level2;

public class RandomArrayStatistics {

    // Method to generate 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int number : numbers) {

            sum += number;

            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        double average = sum / numbers.length;

        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {

        final int SIZE = 5;

        int[] numbers = generate4DigitRandomArray(SIZE);

        System.out.print("Generated numbers: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}