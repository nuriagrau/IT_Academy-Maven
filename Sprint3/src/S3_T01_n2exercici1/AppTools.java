package S3_T01_n2exercici1;

import S3_T01_n1exercici1.Undo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTools {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(Application app) {
        int option;
        String street;
        String streetNumber;
        String floorNumber;
        String doorNumber;
        String postCode;
        String phoneNumber;

        do {
            option = inputInt("\nSelect an option:\n" +
                    "0. Exit\n" +
                    "1. Add Address\n" +
                    "3. Delete Address\n" +
                    "4. List AddressBook\n");

            switch (option) {
                case 0:
                    System.out.println("Aloha!");
                    break;
                case 1:
                    Address newAddress = app.createAddress();
                    System.out.println(newAddress.toString());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (option != 0);
    }

    public static String[] requestAddressData() {
        String[] addressData;
        String name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, phoneNumber;
        boolean hasFloorNumber;
        boolean hasDoorNumber;
        name = inputString("Name: ");
        street = inputString("Street name: ");
        streetNumber = inputString("Street number: ");
        hasFloorNumber = inputBoolean("The address has floor number (true or false)? ");
        if (hasFloorNumber) {
            floorNumber = inputString("Floor number: ");
        } else {
            floorNumber = "";
        }
        hasDoorNumber = inputBoolean("The address has door number (true or false)? ");
        if (hasDoorNumber) {
            doorNumber = inputString("Door number: ");
        } else {
            doorNumber = "";
        }
        postCode = inputString("Post code: ");
        cityTown = inputString("City or Town: ");
        county = inputString("County: ");
        phoneNumber = inputString("Phone number without country code: ");
        return new String[] {name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, phoneNumber};
    }


    public static int inputInt(String request) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(request);
            try {
                input = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.err.println("Format Error. Please enter a valid integer.");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String inputString(String missatge) {
        Boolean isValid = false;
        String userInput = "";
        do {
            try {
                System.out.println(missatge);
                userInput = scanner.nextLine();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Format Error. Introduce a String.");
            }
        } while (!isValid || userInput.length() == 0);
        return userInput;

    }

    public static boolean inputBoolean(String request) {
        boolean input = false;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(request);
            try {
                input = scanner.nextBoolean();
                isValid = true;
            } catch (InputMismatchException e) {
                System.err.println("Format Error. Please enter true or false.");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }
}
