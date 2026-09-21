package level1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        System.out.println("Area of triangle in square inches = " +
                areaInSquareInches);
        System.out.println("Area of triangle in square centimeters = " +
                areaInSquareCentimeters);

        input.close();
    }
}
