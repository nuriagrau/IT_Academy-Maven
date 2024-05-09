package Tasca5.S1_T05_n1exercici5;

import java.io.*;
import static Tasca5.S1_T05_n1exercici5.Tools.*;


public class Main {
    public static void main(String[] args) {
        // TODO Ara el programa ha de serialitzar un Objecte Java a un fitxer.ser i després l’ha de desserialitzar.
        String dirPath = "";// args[0]
        String userDirectoryPath = System.getProperty("user.dir") + "/Sprint1/src/main/java";
        String filePath = userDirectoryPath + "/Tasca5/S1_T05_n1exercici5/";
        String txtFilename = filePath; // args[1]
        String serFilename = filePath;// args[2]
        int level = 0;

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        txtFilename += (args.length > 1) ? args[1] : "SortedDirList.txt";
        serFilename += (args.length == 3) ? args[2] : "Transporter.ser";

        File directory = new File(dirPath);
        if (directory.exists()) {
            File[] sortedDirFiles = getSortedDirFiles(directory);
            if (sortedDirFiles != null) {
                String header = displayDirectoryHeader(dirPath);
                String dirContent = listDirContent(sortedDirFiles, level);
                try {
                    writeDirectoryToFile(txtFilename, header, dirContent);
                    readAndShowTXT(txtFilename);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The directory does not exist");
        }

        // Serialization and Deserialization of an object
        Transporter Spock = new Transporter("Spock", "Half-vulcan, Half-human", "Lieutenant commander", "Vulcan");
        startTeletransportation(serFilename, Spock);
    }
}
