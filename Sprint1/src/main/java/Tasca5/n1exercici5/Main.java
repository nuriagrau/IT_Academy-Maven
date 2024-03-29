package Tasca5.n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // TODO Ara el programa ha de serialitzar un Objecte Java a un fitxer.ser i després l’ha de desserialitzar.
        String dirPath = "";// args[0]
        String userDirectoryPath = System.getProperty("user.dir");
        String filePath = userDirectoryPath + "/Tasca5/n1exercici5/";
        String txtFilename = filePath; // args[1]
        String serFilename = filePath;// args[2]

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        txtFilename += (args.length > 1) ? args[1] : "SortedDirList.txt";
        serFilename += (args.length == 3) ? args[2] : "Transporter.ser";

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = n1exercici5_tools.getSortedDirFiles(directory);
                try {
                    String header = n1exercici5_tools.displayDirectoryHeader(dirPath);
                    String dirContent = n1exercici5_tools.listDirContent(sortedDirFiles, 0);
                    n1exercici5_tools.writeDirectoryToFile(txtFilename, header, dirContent);
                    try {
                        File file = new File(txtFilename);
                        n1exercici5_tools.readAndShowTXT(file);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Hi ha hagut un problema al llegir el directori");
            }
        } else {
            System.out.println("The directory does not exist");
        }

        // Serialization and Deserialization of an object
        Transporter Spock = new Transporter("Spock", "Half-vulcan, Half-human", "Lieutenant commander", "Vulcan");
        n1exercici5_tools.startTeletransportation(serFilename, Spock);
    }
}
