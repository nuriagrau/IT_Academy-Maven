package finishedScapeRoom;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTools {

    /*Funcionalidades Mínimas:
        1. Crear una nueva sala.
        2. Añadir pistas a una sala específica.
        3. Introducir objetos de decoración para ambientar las salas.
        4. Mostrar el inventario actualizado, incluyendo cantidades disponibles y valor total.
        5. Permitir la retirada de elementos del inventario.*/

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Room> laSalaDeLosEnigmas = new ArrayList<>();

    public static void startMenu() {
        int option = 0;
        String message = "";
        do {
            message = "";
            option = inputInt("Welcome to La Sala De Los Enigmas. Choose an option:\n" +
                    "0. Exit\n" +
                    "1. Create a new room\n" +
                    "2. Add clues to a room\n" +
                    "3. Add decoration objects to a room\n" +
                    "4. Show inventory\n" +
                    "5. Remove inventory elements\n");

            switch (option) {
                case 0:
                    message = "You are leaving a Sala De Los Enigmas.... Aloha!";
                    break;
                case 1:
                    message = createANewRoom();
                    break;
                case 2:
                    message = addClue();
                    break;
                case 3:
                    message = addObject();
                    break;
                case 4:
                    message = showInventory();
                    break;
                case 5:
                    message = removeElement();
                    break;
            }
            System.out.println(message);
        } while (option != 0);
    }


    private static String removeElement() {
        String message = "";
        String roomName;
        String elementName;
        int roomIndex, elementIndex = -1;
        do {
            roomName = inputString("The following rooms have been created: \n" + showRooms() + "\nEnter the room to show its inventory: ");
            roomIndex = getRoomIndex(roomName);
        } while (roomIndex == -1);
        Room thisRoom = laSalaDeLosEnigmas.get(roomIndex);
        do {
            elementName = inputString(getInventory(roomName, roomIndex) +
                    "Enter the element name to remove: ");
            elementIndex= thisRoom.getElementIndex(elementName);
        } while (elementIndex == -1);
        message = (laSalaDeLosEnigmas.get(elementIndex).removeElement(elementIndex))? "The element " + elementName + " has been removed" : "This element does not exist" ;
        return message + "\n";
    }

    private static String showInventory() {
        String roomName, message;
        int roomIndex = -1;
        do {
            roomName = inputString("The following rooms have been created: \n" + showRooms().toString() + "\nEnter the room to show its inventory: ");
            roomIndex = getRoomIndex(roomName);
            if (roomIndex != -1) {
                message = getInventory(roomName, roomIndex);
            } else {
                message = "This room does not exist.";
            }
        } while (roomIndex == -1);
        return message;
    }

    private static String getInventory(String roomName, int roomIndex) {
        String inventory = "The inventory for room " + roomName + " is:\n";
        Room thisRoom = laSalaDeLosEnigmas.get(roomIndex);
        if (thisRoom.getElements().size() > 0) {
            for (Element e : thisRoom.getElements()){
                inventory = inventory  + e.toString();
            }
        } else {
            inventory = "The room " + roomName + " is empty.\n";
        }
        return thisRoom.toString() +  inventory;
    }

    private static String addClue() {
        String roomName = "", name = "", message = "", topic = "";
        double rawPrice;
        int roomIndex = -1;
        int estimatedTimeInSeconds;
        do {
            roomName = inputString("The following rooms have been created: \n" + showRooms() + "\nEnter the room to add the clue: ");
            roomIndex = getRoomIndex(roomName);
        } while (roomIndex == -1);
        name = inputString("Enter the clue name: ");
        topic = inputString("Enter the clue topic: ");
        estimatedTimeInSeconds = inputInt("Enter the estimated resolution time in seconds: ");
        rawPrice = inputDouble("Enter the raw price of the clue: ");
        Clue newClue = new Clue(name, rawPrice, topic, estimatedTimeInSeconds);
        message = (laSalaDeLosEnigmas.get(roomIndex).addElement(newClue))? ("The clue " + name + " has been added to room " + roomName) : "This clue already exists";
        return message + "\n";
    }

    private static String addObject() {
        String roomName, name, message = "", material;
        boolean found = false;
        int roomIndex = -1;
        double rawPrice;
        do {
            roomName = inputString("The following rooms have been created: \n" + showRooms().toString() + "\nEnter the room to add the object: ");
            roomIndex = getRoomIndex(roomName);
        } while (roomIndex == -1);
        name = inputString("Enter the object name: ");
        do {
            material = inputString("Materials are:\n" +
                    "WOOD, METAL, GLASS, PLASTIC, TEXTILE, PLANT, CARDBOARD, PAPER, LATEX\n" +
                    "Enter the object material: ");
            found = Material.findByValue(material);
        } while (!found);
        rawPrice = inputDouble("Enter the raw price of the object: ");
        Object newObject = new Object(name, rawPrice, material.toUpperCase());
        message = (laSalaDeLosEnigmas.get(roomIndex).addElement(newObject))? "The object " + name + " has been added to room " + roomName : "This object already exists";
        return message + "\n";
    }

    public static String createANewRoom() {
        String message = "";
        String name = "";
        String level = "";
        boolean foundEnum = false;
        name = inputString("Enter the name of the new room: ");
        do {
            level = inputString("Enter the difficulty level (VERYLOW, LOW, MEDIUM, HIGH, VERYHIGH): ");
            foundEnum = DifficultyLevel.findByValue(level);
        } while (!foundEnum);
        Room newRoom = new Room(name, level.toUpperCase());
        message = (addRoom(newRoom))? ("The new room " + name + " has been created") : "This room already exists.";
         return message + "\n";
    }

    public static boolean addRoom(Room room) {
        boolean addedRoom = false;
        String roomName = room.getName();
        int roomIndex = getRoomIndex(roomName);
        if (roomIndex == -1 || laSalaDeLosEnigmas.size() == 0) {
            laSalaDeLosEnigmas.add(room);
            addedRoom = true;
        }
        return addedRoom;
    }

    public static ArrayList<String> showRooms() {
        ArrayList rooms = new ArrayList<>();
        for (Room r : laSalaDeLosEnigmas) {
            rooms.add(r.getName());
        }
        return rooms;
    }


  public static int getRoomIndex(String name) {
        boolean found = false;
        int roomIndex = -1;
        if (laSalaDeLosEnigmas.size() > 0 && !found) {
            for (int i = 0; i < laSalaDeLosEnigmas.size(); i++) {
                if (laSalaDeLosEnigmas.get(i).getName().equalsIgnoreCase(name)) {
                    roomIndex = i;
                    found = true;
                }
            }

        }
        return roomIndex;
  }


    public static int inputInt(String request){
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(request);
            try {
                input =  scanner.nextInt();
                isValid = true;
            } catch(InputMismatchException e) {
                System.err.println("Format Error. Please enter a valid integer.");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }

    public static double inputDouble(String request){
        double input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(request);
            try {
                input =  scanner.nextDouble();
                isValid = true;
            } catch(InputMismatchException e) {
                System.err.println("Format Error. Please enter a valid integer.");
            } finally {
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String inputString(String missatge){
        Boolean isValid  = false;
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

}

