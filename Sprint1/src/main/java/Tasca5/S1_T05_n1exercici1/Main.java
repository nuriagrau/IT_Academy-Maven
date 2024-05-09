package Tasca5.S1_T05_n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static Tasca5.S1_T05_n1exercici1.Tools.*;

public class Main {
    //TODO Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

    public static void main(String[] args) {
        String userDirectoryPath = System.getProperty("user.dir") + "/src/main/java";
        String dirPath = (args.length > 0)? args[0] : userDirectoryPath;

            File directory = new File(dirPath);
            if (directory.exists()) {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                if (sortedDirFiles != null) {
                    displayDirContent(sortedDirFiles);
                } else {
                    System.out.println("The directory is empty.");
                }
            } else {
                System.out.println("The directory path is invalid.");
            }

    }

}
