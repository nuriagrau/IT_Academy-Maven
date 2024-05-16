package S3_T01_n1exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppTools {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        int option;
        String command = "";

        do {
            option = inputInt("\nSelect an option:\n" +
                    "0. Exit\n" +
                    "1. Add command\n" +
                    "2. Undo\n" +
                    "3. Delete command\n" +
                    "4. List commands\n");

            switch (option) {
                case 0:
                    System.out.println("Aloha!");
                    break;
                case 1:
                    Undo undo1 = Undo.getInstance();
                    command = inputString("Enter an action: ");
                    undo1.addCommand(command);
                    break;
                case 2:
                    Undo undo2 = Undo.getInstance();
                    undo2.getCommands().remove(undo2.getCommands().size() - 1);
                    break;
                case 3:
                    Undo undo3 = Undo.getInstance();
                    undo3.listCommands();
                    command = inputString("Enter the action to delete: ");
                    undo3.removeCommand(command);
                    break;
                case 4:
                    Undo undo4 = Undo.getInstance();
                    undo4.listCommands();
                    break;
            }
        } while (option != 0);
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

}
