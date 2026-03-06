import models.*;
import insurance.*;
import payments.*;
import utils.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        Vehicle[] cars = new Vehicle[] {
                new Car("C1","Toyota","Vios",2000, VehicleStatus.AVAILABLE,4,true),
                new Car("C2","Honda","City",2200, VehicleStatus.AVAILABLE,4,true),
                new Car("C3","Suzuki","Celerio",1800, VehicleStatus.MAINTENANCE,4,false)
        };

        Vehicle[] motorcycles = new Vehicle[] {
                new Motorcycle("M1","Honda","Click",500, VehicleStatus.AVAILABLE,125,true),
                new Motorcycle("M2","Yamaha","Mio",450, VehicleStatus.AVAILABLE,115,true),
                new Motorcycle("M3","Suzuki","Raider",600, VehicleStatus.RENTED,150,true)
        };

        Vehicle[] trucks = new Vehicle[] {
                new Truck("T1","Isuzu","Elf",3000, VehicleStatus.AVAILABLE,2,"Small"),
                new Truck("T2","Mitsubishi","Canter",4000, VehicleStatus.AVAILABLE,3,"Medium"),
                new Truck("T3","Hino","500",5000, VehicleStatus.MAINTENANCE,5,"Large")
        };

        System.out.println("                                                      ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗            ");
        System.out.println("                                                      ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝            ");
        System.out.println("                                                      ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗              ");
        System.out.println("                                                      ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝              ");
        System.out.println("                                                      ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗            ");
        System.out.println("                                                       ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝            ");
        System.out.println("                                                                                                              ");
        System.out.println("                                                      ████████╗ ██████╗     ██╗   ██╗███████╗██╗  ██╗██╗ ██████╗██╗     ███████╗");
        System.out.println("                                                      ╚══██╔══╝██╔═══██╗    ██║   ██║██╔════╝██║  ██║██║██╔════╝██║     ██╔════╝");
        System.out.println("                                                         ██║   ██║   ██║    ██║   ██║█████╗  ███████║██║██║     ██║     █████╗  ");
        System.out.println("                                                         ██║   ██║   ██║    ╚██╗ ██╔╝██╔══╝  ██╔══██║██║██║     ██║     ██╔══╝  ");
        System.out.println("                                                         ██║   ╚██████╔╝     ╚████╔╝ ███████╗██║  ██║██║╚██████╗███████╗███████╗");
        System.out.println("                                                         ╚═╝    ╚═════╝       ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═╝ ╚═════╝╚══════╝╚══════╝");
        System.out.println("                                                                                            ");
        System.out.println("                                                      ██████╗ ███████╗███╗   ██╗████████╗ █████╗ ██╗                            ");
        System.out.println("                                                      ██╔══██╗██╔════╝████╗  ██║╚══██╔══╝██╔══██╗██║                            ");
        System.out.println("                                                      ██████╔╝█████╗  ██╔██╗ ██║   ██║   ███████║██║                            ");
        System.out.println("                                                      ██╔══██╗██╔══╝  ██║╚██╗██║   ██║   ██╔══██║██║                            ");
        System.out.println("                                                      ██║  ██║███████╗██║ ╚████║   ██║   ██║  ██║███████╗                       ");
        System.out.println("                                                      ╚═╝  ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚══════╝                       ");
        System.out.println("                                                                                            ");
        System.out.println("                                                      ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗                     ");
        System.out.println("                                                      ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║                     ");
        System.out.println("                                                      ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║                     ");
        System.out.println("                                                      ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║                     ");
        System.out.println("                                                      ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║                     ");
        System.out.println("                                                      ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝                     ");
        

        String firstName = "";
        while (true){
            try {
                System.out.print("Enter First Name: ");
                firstName = sc.nextLine();
                customer.setFirstName(firstName);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid name.");
            }
        }


        String lastName = "";
        while (true) {
            try {
                System.out.print("Enter Last Name: ");
                lastName = sc.nextLine();
                customer.setLastName(lastName);

                if (lastName.trim().isEmpty()) {
                    throw new Exception("Last Name cannot be empty.");
                }

                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid name.");
            }
        }

        String phoneNumber = "";
        while (true) {
            try {
                System.out.print("Phone Number: ");
                phoneNumber = sc.nextLine();
                customer.setPhoneNumber(phoneNumber);

                if (phoneNumber.trim().isEmpty()) {
                    throw new Exception("Phone number cannot be empty.");
                }

                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid phone number.");
            }
        }

        /*String address = "";
        while (true) {
            try {
                System.out.print("Address: ");
                address = sc.nextLine();

                if (address.trim().isEmpty()) {
                    throw new Exception("Address cannot be empty.");
                }

                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid address.");
            }
        } */

        System.out.println("\nEnter Address Details:");

        System.out.print("House Number: ");
        String houseNumber = sc.nextLine();

        System.out.print("Street: ");
        String street = sc.nextLine();

        System.out.print("Barangay: ");
        String barangay = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("Zip Code: ");
        String zipCode = sc.nextLine();

        Address address = new Address(
                houseNumber,
                street,
                barangay,
                city,
                zipCode
        );


        String licenseNumber = "";
        while (true) {
            try {
                System.out.print("License Number: ");
                licenseNumber = sc.nextLine();

                if (licenseNumber.trim().isEmpty()) {
                    throw new Exception("License number cannot be empty.");
                }

                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid license number.");
            }
        }

        String expiryDate = "";
        while (true) {
            try {
                System.out.print("Expiry Date (YYYY-MM-DD): ");
                expiryDate = sc.nextLine();

                if (expiryDate.trim().isEmpty()) {
                    throw new Exception("Expiry date cannot be empty.");
                }

                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid expiry date.");
            }
        }

        DriversLicense driverLicense = new DriversLicense(licenseNumber, expiryDate);

        if (!driverLicense.isValid()) {
            System.out.println("Invalid license.");
            return;
        }

        //Customer customer = new Customer("CUS1", firstName, lastName, phoneNumber, address);

        int rentalDays = 0;

        while (true) {
            try {
                System.out.print("How many days for rental? ");
                rentalDays = sc.nextInt();

                if (rentalDays <= 0) {
                    System.out.println("Rental days must be greater than 0.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }

        int type = 0;

        while (true) {
            try {
                System.out.println("\nWhat type of vehicle?");
                System.out.println("1. Car");
                System.out.println("2. Motorcycle");
                System.out.println("3. Truck");

                type = sc.nextInt();

                if (type < 1 || type > 3) {
                    System.out.println("Please choose between 1-3.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
            }
        }

        Vehicle[] list;

        if (type == 1)
            list = cars;
        else if (type == 2)
            list = motorcycles;
        else
            list = trucks;

        System.out.println("\nSelect Vehicle:");

        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". "
                    + list[i].displayName()
                    + " ₱" + list[i].pricePerDay
                    + " [" + list[i].status + "]");
        }

        int choice = 0;

        while (true) {
            try {
                System.out.print("Choose vehicle: ");
                choice = sc.nextInt();

                if (choice < 1 || choice > list.length) {
                    System.out.println("Invalid selection.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
            }
        }

        Vehicle selectedVehicle = list[choice - 1];

        Payment payment = new CashPayment();
        Insurance insurance = new BasicInsurance();

        RentalPeriod rentalPeriod = new RentalPeriod("Today", "Future");

        Reservation reservation =
                new Reservation("Today", selectedVehicle, customer);

        RentalTransaction rental =
                reservation.toRentalTransaction(
                        rentalPeriod,
                        payment,
                        insurance);

        double total =
                rental.computeTotalCost(
                        rentalDays,
                        0);

        System.out.println("\nTotal amount: ₱" + total);

        rental.confirmAndPay();
/*
        private static void printSummary(RentalTransaction transaction, int rentalDays, DriversLicense license) {
            System.out.println("\n===== Rental Summary =====");
            System.out.println("Customer: " + transaction.getCustomer().getName());
            System.out.println("License: " + license.getLicenseNumber() + " (valid until " + license.getExpiryDate() + ")");
            System.out.println("Vehicle: " + transaction.getVehicle().displayName());
            System.out.println("Insurance: " + transaction.getInsurance().getCoverageInfo());
            System.out.println("Rental period: " + transaction.getRentalPeriod());
            System.out.println("Rental days: " + rentalDays);
            System.out.printf("Total cost: ₱%.2f%n", transaction.getTotalCost());
        } */

        System.out.println("\nThank you for renting!");

        sc.close();
    }
}
