package Tasca5.S1_T05_n1exercici1;

import java.io.File;
import java.io.IOException;
import java.nio.file.NotDirectoryException;
import java.util.Arrays;

public class Tools {

    public static File[] getSortedDirFiles(File directory) throws NotDirectoryException{
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static void displayDirContent(File[] sortedDirFiles) throws NullPointerException, IOException {
        for (File filename : sortedDirFiles) {
                if (filename.isDirectory()) {
                    System.out.println(filename.getName());
                    displayDirContent(getSortedDirFiles(filename));
                } else {
                    System.out.println(filename.getName());
                }
        }
    }
}
