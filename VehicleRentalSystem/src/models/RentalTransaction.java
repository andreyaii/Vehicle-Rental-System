package models;

import insurance.Insurance;
import payments.Payment;
import utils.RentalPeriod;
import utils.VehicleStatus;
import utils.PriceCalculator;

public class RentalTransaction {
    Customer customer;
    Vehicle vehicle;
    Payment payment;
    Insurance insurance;
    RentalPeriod rentalPeriod;

    String rentalStatus;
    double totalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, Payment payment, Insurance insurance, RentalPeriod rentalPeriod) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.payment = payment;
        this.insurance = insurance;
        this.rentalPeriod = rentalPeriod;

        this.rentalStatus = "PENDING";
        this.totalCost = 0;
    }

    public double computeTotalCost(int rentalDays, double penalties) {
        totalCost = PriceCalculator.computeTotal(vehicle.pricePerDay, rentalDays, insurance.costPerDay, penalties);
        return totalCost;
    }

    public boolean confirmAndPay() {
        if (!vehicle.isAvailable()) {
            System.out.println("❌ Vehicle is not available. Status: " + vehicle.status);
            rentalStatus = "CANCELLED";
            return false;
        }

        boolean paid = payment.pay(totalCost);
        if (paid) {
            vehicle.setStatus(VehicleStatus.RENTED);
            rentalStatus = "CONFIRMED";
            return true;
        }

        rentalStatus = "FAILED_PAYMENT";
        return false;
    }
}