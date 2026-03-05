package models;

public class Car extends Vehicle {

    int numberOfDoors;
    boolean airConditioned;

    Car(String vehicleId, String brand, String model, double pricePerDay,
        VehicleStatus status, int numberOfDoors, boolean airConditioned) {

        super(vehicleId, brand, model, pricePerDay, status);
        this.numberOfDoors = numberOfDoors;
        this.airConditioned = airConditioned;
    }
}

