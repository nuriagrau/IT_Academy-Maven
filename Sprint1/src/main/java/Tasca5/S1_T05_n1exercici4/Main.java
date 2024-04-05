package Tasca5.S1_T05_n1exercici4;

import java.io.*;
import static Tasca5.S1_T05_n1exercici4.Tools.*;

public class Main {
    // TODO Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String txtFilename = ""; // args[1]
        String userDirectoryPath = System.getProperty("user.dir") + "/Sprint1/src/main/java";

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        txtFilename = (args.length == 2) ? args[1] : "SortedDirList.txt";
        String filePath = userDirectoryPath + "/Tasca5/S1_T05_n1exercici4/" + txtFilename;

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                try {
                    String header = displayDirectoryHeader(dirPath);
                    String dirContent = listDirContent(sortedDirFiles, 0);
                    writeDirectoryToFile(filePath, header, dirContent);
                    try {
                        File file = new File(filePath);
                        readAndShowTXT(file);
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
    }
}
