package models;

public class DriversLicense {
    String licenseNumber;
    String expiryDate;

    DriversLicense(String licenseNumber, String expiryDate) {
        this.licenseNumber = licenseNumber;
        this.expiryDate = expiryDate;
    }

    boolean isValid() {
        return expiryDate != null && !expiryDate.trim().isEmpty();
    }
}
