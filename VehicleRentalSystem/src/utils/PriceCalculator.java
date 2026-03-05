package utils;

public class PriceCalculator {

    static double computeTotal(double pricePerDay, int rentalDays, double insurancePerDay, double penalties) {
        double base = pricePerDay * rentalDays;
        double insuranceFee = insurancePerDay * rentalDays;
        return base + insuranceFee + penalties;
    }
}