import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Author: Ahmed Essam Taj
Date: 10, November
Day 16 - Exercise

 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Vehicle> rentedVehicles = new ArrayList<Vehicle>();

    public static void main(String[] args) {

        int choice;

        do {
            printMneu();
            choice = getValidInput();
            switch (choice) {
                case 1:
                    rentACar();
                    break;
                case 2:
                    rentABike();
                    break;
                case 3:
                    rentATruck();
                    break;
                case 4:
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System! ");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;


            }
        } while (choice != 5);

    }

    public static void printMneu() {
        System.out.println();
        System.out.println("1. Rent a Car ");
        System.out.println("2. Rent a Bike ");
        System.out.println("3. Rent a Truck ");
        System.out.println("4. View Rented Vehicles ");
        System.out.println("5. Exit");
    }

    public static int getValidInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!, please try again..");
                scanner.nextLine();
            }
        }
    }

    public static void rentACar() {
        System.out.print("Enter car Model: ");
        scanner.nextLine();
        String carModel = scanner.nextLine();
        System.out.print("Enter Rental Days: ");
        int rentDays = getValidInput();
        rentedVehicles.add(new Car(carModel, rentDays));
    }

    public static void rentABike() {
        System.out.print("Enter Bike Brand: ");
        scanner.nextLine();
        String brand = scanner.nextLine();
        System.out.print("Enter Rental hours: ");
        int rentHours = getValidInput();
        rentedVehicles.add(new Bike(brand, rentHours));
    }

    public static void rentATruck() {
        System.out.print("Enter Truck Type: ");
        scanner.nextLine();
        String truckType = scanner.nextLine();
        System.out.print("Enter Rental weeks: ");
        int rentWeeks = getValidInput();
        rentedVehicles.add(new Truck(truckType, rentWeeks));
    }

}