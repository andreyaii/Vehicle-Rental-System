package models;
import java.util.*;

public class Customer {
    private String customerId = "CUS1";
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    /*public Customer(String customerId, String firstName, String lastName, String phoneNumber, Address address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }*/

    public void setPhoneNumber(String phoneNumber) {

        if (!phoneNumber.matches("\\d{11}")) {
            throw new IllegalArgumentException("Phone number must contain exactly 11 digits.");
        }

        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {

        if (firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First Name cannot be empty.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {

        String firstTwo = phoneNumber.substring(0, 2);
        String lastFour = phoneNumber.substring(phoneNumber.length() - 4);

        return firstTwo + "*****" + lastFour;
    }

    /*public Address setAddress(Address address) {
        this.address = address;
    }*/

    public Address getAddress() {
        return address;
    }

}
