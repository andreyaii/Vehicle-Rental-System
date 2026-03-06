package models;

import utils.VehicleStatus;

public abstract class Vehicle {

    String vehicleId;
    String brand;
    String model;
    public double pricePerDay;
    public VehicleStatus status;

    public Vehicle(String vehicleId, String brand, String model, double pricePerDay, VehicleStatus status) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    boolean isAvailable() {
        return status == VehicleStatus.AVAILABLE;
    }

    void setStatus(VehicleStatus newStatus) {
        this.status = newStatus;
    }

    public String displayName() {
        return brand + " " + model + " (" + vehicleId + ")";
    }
}

