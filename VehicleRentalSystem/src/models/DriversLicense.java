package models;

public class DriversLicense {
    String licenseNumber;
    String expiryDate;

    public DriversLicense(String licenseNumber, String expiryDate) {
        this.licenseNumber = licenseNumber;
        this.expiryDate = expiryDate;
    }

    public boolean isValid() {
        return expiryDate != null && !expiryDate.trim().isEmpty();
    }
}
