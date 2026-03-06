package models;

import utils.VehicleStatus;

public class Motorcycle extends Vehicle {

    int engineCC;
    boolean helmetIncluded;

    public Motorcycle(String vehicleId, String brand, String model, double pricePerDay,
                      VehicleStatus status, int engineCC, boolean helmetIncluded) {

        super(vehicleId, brand, model, pricePerDay, status);
        this.engineCC = engineCC;
        this.helmetIncluded = helmetIncluded;
    }
}