package Tasca5.S1_T05_n1exercici4;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Tools {

    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static String listDirContent(File[] sortedDirFiles, int level) throws Exception{
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

    public static void writeDirectoryToFile(String filePath, String header, String dirContent) {
        File newFile = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) { // FileWriter creates a new file
            writer.write(header);
            writer.newLine();
            writer.write(dirContent);
            writer.close();
            System.out.println("El contingut del directory s'ha guardat correctament a " + filePath);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés d'escriptura al arxiu.");
        }
    }

    public static String displayDirectoryHeader(String dirPath) {
        String header = "";
        header = "\u007E" + dirPath;
        return header;
    }

    public static void readAndShowTXT(File file) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String string;
        System.out.println(file.getName() + " content is :");
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
        bReader.close();
    }
}
