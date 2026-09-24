package coreProgramming.javaMethods.level3;

import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = calculateArea(
            x1, y1, x2, y2, x3, y3
        );

        return Math.abs(area) < 0.000001;
    }

    public static double calculateArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return 0.5 * (
            x1 * (y2 - y3)
            + x2 * (y3 - y1)
            + x3 * (y1 - y2)
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Point A:");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter Point B:");
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        System.out.println("Enter Point C:");
        System.out.print("x3: ");
        double x3 = input.nextDouble();
        System.out.print("y3: ");
        double y3 = input.nextDouble();

        boolean collinear = areCollinearUsingSlope(
            x1, y1, x2, y2, x3, y3
        );

        System.out.println("Points are collinear: " + collinear);

        System.out.println(
            "Triangle Area: "
            + Math.abs(calculateArea(
                x1, y1, x2, y2, x3, y3
            ))
        );

        input.close();
    }
}