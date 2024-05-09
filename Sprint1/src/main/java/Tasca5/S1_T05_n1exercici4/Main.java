package Tasca5.S1_T05_n1exercici4;

import java.io.*;
import static Tasca5.S1_T05_n1exercici4.Tools.*;

public class Main {
    // TODO Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

    public static void main(String[] args) throws IOException {
        String userDirectoryPath = System.getProperty("user.dir") + "/src/main/java";

        String dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        String txtFilename = (args.length == 2) ? args[1] : "SortedDirList.txt";
        String filePath = userDirectoryPath + "/Tasca5/S1_T05_n1exercici4/" + txtFilename;

        File directory = new File(dirPath);

        if (directory.exists()) {
            String dirContent = readDirectory(directory);
            String header = displayDirectoryHeader(dirPath);
            if (dirContent != null) {
                try {
                    writeDirectoryToFile(filePath, header, dirContent);
                    readAndShowTXT(filePath);
                } catch (IOException e) {
                    System.err.println("Error al escriure a l'arxiu" + e.getMessage());
                } catch (Exception e) {
                    System.err.println("Error al llegir l'arxiu TXT: " + e.getMessage());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else
            System.out.println("The directory does not exist");
        }
}
