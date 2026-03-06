import models.*;
import insurance.*;
import payments.*;
import utils.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
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

            System.out.println("===== Welcome to Vehicle Rental System =====");

            System.out.print("Enter your Name: ");
            String name = sc.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("License Number: ");
            String licenseNumber = sc.nextLine();

            System.out.print("Expiry Date: ");
            String expiryDate = sc.nextLine();

            DriversLicense driverLicense =
                    new DriversLicense(licenseNumber, expiryDate);

            if (!driverLicense.isValid()) {
                System.out.println("Invalid license.");
                return;
            }

            Customer customer =
                    new Customer("CUS1", name, phoneNumber, address);

            System.out.print("How many days for rental? ");
            int rentalDays = sc.nextInt();

            System.out.println("\nWhat type of vehicle?");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Truck");

            int type = sc.nextInt();

            Vehicle[] list;

            if(type == 1)
                list = cars;
            else if(type == 2)
                list = motorcycles;
            else
                list = trucks;

            System.out.println("\nSelect Vehicle:");

            for(int i=0;i<list.length;i++){
                System.out.println((i+1)+". "
                        + list[i].displayName()
                        +" ₱"+list[i].pricePerDay
                        +" ["+list[i].status+"]");
            }

            int choice = sc.nextInt();

            Vehicle selectedVehicle = list[choice-1];

            Payment payment = new CashPayment();

            Insurance insurance = new BasicInsurance();

            RentalPeriod rentalPeriod =
                    new RentalPeriod("Today","Future");

            Reservation reservation =
                    new Reservation("Today",
                            selectedVehicle,
                            customer);

            RentalTransaction rental =
                    reservation.toRentalTransaction(
                            rentalPeriod,
                            payment,
                            insurance);

            double total =
                    rental.computeTotalCost(
                            rentalDays,
                            0);

            System.out.println("\nTotal amount: ₱"+total);

            rental.confirmAndPay();

            System.out.println("\nThank you for renting!");

        }

        catch(InputMismatchException e){

            System.out.println("\nInvalid input!");
            System.out.println("Please enter numbers only where required.");

        }

        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("\nInvalid selection!");
            System.out.println("Please choose a valid option.");

        }

        catch(Exception e){

            System.out.println("\nUnexpected Error Occurred.");

        }

        finally{

            sc.close();

            System.out.println("\nProgram Ended.");

        }

    }
}