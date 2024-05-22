package S3_T01_n2exercici1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTools {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<CountryAddress> AddressBook = new ArrayList<>();


    // elominate exception here
    public static void displayMenu() {
        int option;
        String name;
        int addressIndex;
        String country;
        AddressBookFactory addressBookFactory = null;

        do {
            option = inputInt("\nSelect an option:\n" +
                    "0. Exit\n" +
                    "1. Add Address\n" +
                    "2. Delete Address\n" +
                    "3. List AddressBook\n");

            switch (option) {
                case 0:
                    System.out.println("Aloha!");
                    break;
                case 1:
                    String[] addressData = requestAddressData();
                    country = addressData[8];
                    if (country.equalsIgnoreCase("Denmark")) {
                        addressBookFactory = new DKAddressBook();
                    } else if (country.equalsIgnoreCase("Spain")) {
                        addressBookFactory = new ESAddressBook();
                    } else if (country.equalsIgnoreCase("United Kingdom")) {
                        addressBookFactory = new UKAddressBook();
                    } else {
                        System.out.println("Error! This country AddressBook has not been created.");
                    }
                    Application app = new Application(addressBookFactory);
                    Address newAddress = app.createAddress(addressData);
                    AddressBook.add((CountryAddress) newAddress);
                    System.out.println(newAddress.toString());
                    break;
                case 2:
                    if (AddressBook.size() > 0) {
                        System.out.println(listAddressBookNames());
                        do {
                            name = inputString("Enter the name of the address to delete: ");
                            addressIndex = getAddressIndex(name);
                            if (addressIndex != -1) {
                                AddressBook.remove(addressIndex);
                                System.out.println("The address of " + name + " has been deleted.");
                            } else {
                                System.out.println("This room does not exist.");
                            }
                        } while (addressIndex == -1);
                    } else {
                        System.out.println("The Address Book is empty.");
                    }
                    break;
                case 3:
                    // Adress book is empty
                    if (AddressBook.size() > 0) {
                        AddressBook.sort(
                                (CountryAddress a1,CountryAddress a2) -> a1.compareTo(a2));
                        for (CountryAddress address: AddressBook) {
                            System.out.println(address.toString());
                        }
                    } else {
                        System.out.println("The address book is empty.");
                    }
                    break;
            }
        } while (option != 0);
    }

    public static String[] requestAddressData() {
        String[] addressData;
        String name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, country, phoneNumber;
        boolean hasFloorNumber;
        boolean hasDoorNumber;
        boolean found = false;
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
        county = inputString("County or province: ");
        do {
            country = inputString("Country (Denmark, Spain, United Kingdom):\n");
            found = Countries.findByValue(country);
        } while (!found);
        phoneNumber = inputString("Phone number without country code: ");
        return new String[] {name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, country, phoneNumber};
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

    public static int getAddressIndex(String name) {
        boolean found = false;
        int addressIndex = -1;
        if (AddressBook.size() > 0 && !found) {
            for (int i = 0; i < AddressBook.size(); i++) {
                if (AddressBook.get(i).getName().equalsIgnoreCase(name)) {
                    addressIndex = i;
                    found = true;
                }
            }

        }
        return addressIndex;
    }

    public static String listAddressBookNames() {
        String message = "The names in the Address Book are: ";
        for (CountryAddress a : AddressBook) {
                message += a.getName() + "\n";
        }
        return message;
    }
}


