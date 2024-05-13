package examenScapeRoom;

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


    public static String startMenu() {
        int option = 0;
        String message = "";
        option = requireInput("Welcome to La Sala De Los Enigmas. Choose an option:\n" +
                    "0. Exit\n" +
                    "1. Create a new room\n" +
                    "2. Add clues to a room\n" +
                    "3. Add decoration objects to a room\n" +
                    "4. Show inventory\n" +
                    "5. Remove inventory elements\n", option);

        switch(option) {
            case 0:
                message = "You are leaving a Sala De Los Enigmas.... Aloha!";
                break;
            case 1:
                message = createANewRoom();
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                // lambdas filtering elements of the arrayList elements of the room
                break;
            case 5:
                break;

        }
        return message;
    }

    public static String createANewRoom() {
        ArrayList<Sala> laSalaDeLosEnigmas = new ArrayList<>();
        String message = "";
        String name = "";
        String difficultyLevel;
        name = requireInput("Name of the new room:", name);
        if (name != "") {
            difficultyLevel = requireInput("What will be the difficulty level (VERYLOW, LOW, MEDIUM, HIGH, VERYHIGH):", name);
            Sala newSala = new Sala(name, difficultyLevel);
            message = "The new room " + name + "has been created";
        } else {
            message = "Something went wrong when creating the new room";
        }
        return message;
    }


    public static int requireInput(String request, int parameter){
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(request);
            try {
                input =  scanner.nextInt();
                isValid = true;

            } catch(InputMismatchException e) {
                System.err.println("Format Error. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String requireInput(String request, String parameter) {
        System.out.print(request + ": ");
        scanner.nextLine();
        while (true) {
            try {
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error. Please enter a valid input.");
                System.out.print(request + ": ");
                scanner.nextLine();
            }
        }
    }



}

