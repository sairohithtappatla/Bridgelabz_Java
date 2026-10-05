import java.util.ArrayList;
import java.util.List;

abstract class RentalVehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalVehicle(
            String vehicleNumber,
            String type,
            double rentalRate) {

        this.vehicleNumber = vehicleNumber;
        this.type = type;
        setRentalRate(rentalRate);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        } else {
            throw new IllegalArgumentException(
                "Rental rate cannot be negative."
            );
        }
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

class RentalCar extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    public RentalCar(
            String vehicleNumber,
            double rentalRate,
            String insurancePolicyNumber) {

        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance policy is active.";
    }
}

class RentalBike extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    public RentalBike(
            String vehicleNumber,
            double rentalRate,
            String insurancePolicyNumber) {

        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance policy is active.";
    }
}

class RentalTruck extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    public RentalTruck(
            String vehicleNumber,
            double rentalRate,
            String insurancePolicyNumber) {

        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance policy is active.";
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<RentalVehicle> vehicles = new ArrayList<>();

        vehicles.add(
            new RentalCar("CAR101", 2000, "CAR-POL-001")
        );

        vehicles.add(
            new RentalBike("BIKE102", 800, "BIKE-POL-002")
        );

        vehicles.add(
            new RentalTruck("TRUCK103", 4000, "TRUCK-POL-003")
        );

        int days = 3;

        for (RentalVehicle vehicle : vehicles) {

            System.out.println("Vehicle: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());

            double rentalCost =
                vehicle.calculateRentalCost(days);

            System.out.println("Rental Cost: ₹" + rentalCost);

            Insurable insurable = (Insurable) vehicle;

            System.out.println(
                "Insurance: ₹" +
                insurable.calculateInsurance()
            );

            System.out.println(
                insurable.getInsuranceDetails()
            );

            System.out.println("--------------------");
        }
    }
}