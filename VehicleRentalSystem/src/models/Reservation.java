package models;

public class Reservation {

    String reservationDate;
    Vehicle vehicle;
    Customer customer;

    Reservation(String reservationDate, Vehicle vehicle, Customer customer) {
        this.reservationDate = reservationDate;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    RentalTransaction toRentalTransaction(RentalPeriod rentalPeriod, Payment payment, Insurance insurance) {
        return new RentalTransaction(customer, vehicle, payment, insurance, rentalPeriod);
    }
}
