package Tasca5.n1exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    /* TODO Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el
       contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic
       dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.
    */
    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles, new Comparator<File>() {
            @Override
            public int compare(File a, File b) {
                return a.getName().compareTo(b.getName());
            }
        });
        return sortedDirFiles;
    }

    public static void displayDirContent(File[] sortedDirFiles) {
        for (File filename : sortedDirFiles) {
            if (filename.isDirectory()) {
                System.out.println("(D)" + filename.getName());
                displayDirContent(getSortedDirFiles(filename));
            } else {
                System.out.println("(F)" + filename.getName());
            }
        }
    }



    public static void main(String[] args) {
        // full path directory can be main args
        String dirPath = "/Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/src/main/java";

        // file object
        File directory= new File(dirPath);
        File[] sortedDirFiles = getSortedDirFiles(directory);
        displayDirContent(sortedDirFiles);

    }
}
