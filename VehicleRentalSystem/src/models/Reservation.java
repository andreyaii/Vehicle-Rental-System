package models;

import insurance.Insurance;
import payments.Payment;
import utils.RentalPeriod;

public class Reservation {

    String reservationDate;
    Vehicle vehicle;
    Customer customer;

    public Reservation(String reservationDate, Vehicle vehicle, Customer customer) {
        this.reservationDate = reservationDate;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    public RentalTransaction toRentalTransaction(RentalPeriod rentalPeriod, Payment payment, Insurance insurance) {
        return new RentalTransaction(customer, vehicle, payment, insurance, rentalPeriod);
    }
}
