class HybridVehicle {
    protected int maxSpeed;
    protected String model;

    public HybridVehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends HybridVehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends HybridVehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle electricVehicle =
            new ElectricVehicle(160, "Tesla Model 3");

        PetrolVehicle petrolVehicle =
            new PetrolVehicle(200, "Toyota Camry");

        electricVehicle.displayInfo();
        electricVehicle.charge();

        System.out.println("--------------------");

        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
    }
}