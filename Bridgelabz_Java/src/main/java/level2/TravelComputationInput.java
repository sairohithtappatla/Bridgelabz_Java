package level2;

import java.util.Scanner;

public class TravelComputationInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity +
                " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity +
                " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter time from " + fromCity +
                " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter time from " + viaCity +
                " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance =
                distanceFromToVia + distanceViaToFinalCity;

        int totalTime =
                timeFromToVia + timeViaToFinalCity;

        System.out.println(
                "The Total Distance travelled by " + name +
                " from " + fromCity +
                " to " + toCity +
                " via " + viaCity +
                " is " + totalDistance +
                " miles and the Total Time taken is " +
                totalTime + " minutes"
        );

        input.close();
    }
}
