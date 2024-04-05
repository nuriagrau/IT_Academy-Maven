package Tasca5.S1_T05_n1exercici3;


import java.io.File;
import java.io.IOException;
import static Tasca5.S1_T05_n1exercici3.Tools.*;


public class Main {
    // TODO Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un
    //  fitxer TXT.

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String txtFilename = ""; // args[1]
        String userDirectoryPath = System.getProperty("user.dir") + "/Sprint1/src/main/java";

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        txtFilename = (args.length == 2) ? args[1] : "SortedDirList.txt";
        String filePath = userDirectoryPath + "/Tasca5/S1_T05_n1exercici3/" + txtFilename;

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                try {
                    writeDirectoryToFile(filePath, displayDirectoryHeader(dirPath), listDirContent(sortedDirFiles, 0));
                } catch (IOException e) {
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
