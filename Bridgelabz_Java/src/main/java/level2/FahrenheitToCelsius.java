package level2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(
                "The " + fahrenheit +
                " Fahrenheit is " + celsiusResult +
                " Celsius"
        );

        input.close();
    }
}
