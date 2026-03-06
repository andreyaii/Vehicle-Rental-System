package models;

public class Address {
    private String houseNumber;
    private String street;
    private String barangay;
    private String city;
    private String zipCode;

    public Address(String houseNumber, String street, String barangay,
                   String city, String zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return houseNumber + " " + street + ", Brgy. " + barangay +
                ", " + city + ", " + zipCode;
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}
