package models;
import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {

        if (!phoneNumber.matches("\\d{11}")) {
            throw new IllegalArgumentException("Phone number must contain exactly 11 digits.");
        }

        this.phoneNumber = phoneNumber;
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
        if (lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last Name cannot be empty.");
        }
        this.lastName = lastName;
    }

    public String getPhoneNumber() {

        String firstTwo = phoneNumber.substring(0, 2);
        String lastFour = phoneNumber.substring(phoneNumber.length() - 4);

        return firstTwo + "*****" + lastFour;
    }

}
