package models;

public class Truck extends Vehicle {

    double loadCapacity;
    String truckType;

    Truck(String vehicleId, String brand, String model, double pricePerDay,
          VehicleStatus status, double loadCapacity, String truckType) {

        super(vehicleId, brand, model, pricePerDay, status);
        this.loadCapacity = loadCapacity;
        this.truckType = truckType;
    }
}
