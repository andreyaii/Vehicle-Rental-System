package models;

public class Customer {
    String customerId;
    String name;
    String phoneNumber;
    String address;

    Customer(String customerId, String name, String phoneNumber, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
