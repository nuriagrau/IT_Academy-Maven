package Tasca5.S1_T05_n1exercici1;

import java.io.File;
import static Tasca5.S1_T05_n1exercici1.Tools.*;

public class Main {
    //TODO Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String userDirectoryPath = System.getProperty("user.dir") + "/Sprint1/src/main/java";

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;

        // file object
        File directory= new File(dirPath);
        if (directory.exists()) {
            File[] sortedDirFiles = getSortedDirFiles(directory);
            displayDirContent(sortedDirFiles);
        }
    }

}
