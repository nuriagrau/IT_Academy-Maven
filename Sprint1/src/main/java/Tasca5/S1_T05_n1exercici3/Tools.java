package Tasca5.S1_T05_n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Tools {
    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static String listDirContent(File[] sortedDirFiles, int level) {
        String dirContent = "";
        for (File filename : sortedDirFiles) {
            Date dateLast = new Date(filename.lastModified());
            String identation = "    ";// 4 spaces like "(X) " notation
            if (filename.isDirectory()) {
                identation = (level != 0)? identation.repeat(level): "";
                dirContent += identation + "\u2304 (D) " + filename.getName() + "   |Last Modified: " + dateLast +"\n";
                level++; // before recursion add one level
                dirContent += listDirContent(getSortedDirFiles(filename), level);
                level --; // after recursion remove one level
            } else {
                identation = (level != 0)? identation.repeat(level): "";
                dirContent += identation + "> (F) " + filename.getName() + "   |Last Modified: " + dateLast + "\n";
            }
        }
        return dirContent;
    }

    public static void writeDirectoryToFile(String filePath, String header, String dirContent) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(header);
            writer.newLine();
            writer.write(dirContent);
            writer.close();
    }


    public static String displayDirectoryHeader(String dirPath) {
        String header = "";
        header = "\u007E" + dirPath;
        return header;
    }
}
