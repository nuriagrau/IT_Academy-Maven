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

        try {
            File directory = new File(dirPath);
            if (directory.exists()) {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                displayDirContent(sortedDirFiles);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
