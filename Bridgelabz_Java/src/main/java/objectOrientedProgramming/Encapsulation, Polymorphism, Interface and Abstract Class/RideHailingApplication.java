import java.util.ArrayList;
import java.util.List;

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(
            String vehicleId,
            String driverName,
            double ratePerKm) {

        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate/KM: ₹" + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

class RideCar extends RideVehicle implements GPS {
    private String currentLocation = "Chennai";

    public RideCar(
            String vehicleId,
            String driverName,
            double ratePerKm) {

        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class RideBike extends RideVehicle implements GPS {
    private String currentLocation = "Chennai";

    public RideBike(
            String vehicleId,
            String driverName,
            double ratePerKm) {

        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class RideAuto extends RideVehicle implements GPS {
    private String currentLocation = "Chennai";

    public RideAuto(
            String vehicleId,
            String driverName,
            double ratePerKm) {

        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class RideHailingApplication {

    public static void main(String[] args) {

        List<RideVehicle> vehicles = new ArrayList<>();

        vehicles.add(
            new RideCar(
                "CAR101",
                "Ravi",
                20
            )
        );

        vehicles.add(
            new RideBike(
                "BIKE102",
                "Arun",
                10
            )
        );

        vehicles.add(
            new RideAuto(
                "AUTO103",
                "Kumar",
                15
            )
        );

        double distance = 10;

        for (RideVehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            double fare =
                vehicle.calculateFare(distance);

            System.out.println(
                "Fare for " +
                distance +
                " KM: ₹" +
                fare
            );

            GPS gps = (GPS) vehicle;

            System.out.println(
                "Current Location: " +
                gps.getCurrentLocation()
            );

            System.out.println("--------------------");
        }
    }
}