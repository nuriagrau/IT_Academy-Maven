package Tasca5.S1_T05_n1exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Main {

    /* TODO Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el
       contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic
       dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.
    */
    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static void displayDirContent(File[] sortedDirFiles, int level) {
        for (File filename : sortedDirFiles) {
            Date dateLast = new Date(filename.lastModified());
            String identation = "    ";// 4 spaces like "(X) " notation
            if (filename.isDirectory()) {
                identation = (level != 0)? identation.repeat(level): "";
                System.out.println( identation + "\u2304 (D) " + filename.getName() + "   |Last Modified: " + dateLast);
                level++; // before recursion add one level
                displayDirContent(getSortedDirFiles(filename), level);
                level --; // after recursion remove one level
            } else {
                identation = (level != 0)? identation.repeat(level): "";
                System.out.println(identation + "> (F) " + filename.getName() + "   |Last Modified: " + dateLast);
            }
        }
    }

    public static String displayDirectoryHeader(String dirPath) {
        String header = "";
        header = "\u007E" + dirPath;
        return header;
    }

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String userDirectoryPath = System.getProperty("user.dir");

        dirPath = (args.length == 1)? args[0] : userDirectoryPath;

        // file object
        File directory= new File(dirPath);
        if (directory.exists()) {
            File[] sortedDirFiles = getSortedDirFiles(directory);
            System.out.println(displayDirectoryHeader(dirPath));
            displayDirContent(sortedDirFiles, 0);
        }
    }
}
