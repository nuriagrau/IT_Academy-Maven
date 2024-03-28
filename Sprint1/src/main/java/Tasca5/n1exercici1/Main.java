package Tasca5.n1exercici1;

import java.io.File;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    //TODO Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        /*Arrays.sort(sortedDirFiles, new Comparator<File>() {
                    @Override
                    public int compare(File a, File b) {

                        return a.getName().compareTo(b.getName());
                    }
                });*/
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static void displayDirContent(File[] sortedDirFiles) {
        for (File filename : sortedDirFiles) {
            if (filename.isDirectory()) {
                System.out.println(filename.getName());
                displayDirContent(getSortedDirFiles(filename));
            } else {
                System.out.println(filename.getName());
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
