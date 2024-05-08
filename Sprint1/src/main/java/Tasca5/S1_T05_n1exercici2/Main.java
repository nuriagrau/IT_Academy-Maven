package Tasca5.S1_T05_n1exercici2;

import java.io.File;
import static Tasca5.S1_T05_n1exercici2.Tools.*;
public class Main {

    // TODO Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el
    //  contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic
    //  dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String userDirectoryPath = System.getProperty("user.dir") + "/src/main/java";

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;

        // file object
        File directory= new File(dirPath);
        if (directory.exists()) {
            File[] sortedDirFiles = getSortedDirFiles(directory);
            System.out.println(displayDirectoryHeader(dirPath));
            displayDirContent(sortedDirFiles, 0);
        }
    }
}
