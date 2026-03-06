package models;

public class Address {
    private String houseNumber;
    private String street;
    private String barangay;
    private String city;
    private String zipCode;
    private String province;

    public Address(String houseNumber, String street, String barangay,
                   String city, String zipCode, String province) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.zipCode = zipCode;
        this.province = province;
    }

    public String getRedactedAddress(){
        return "****, " + city + ", " + province + ", " + zipCode;
    }

    /*@Override
    public String toString() {
        return getRedactedAddress();
    } */
}
