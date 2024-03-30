package Tasca5.S1_T05_n1exercici4;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    // TODO Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
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

    public static void readAndShowTXT(File file) throws IOException{
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String string;
        System.out.println(file.getName() + " content is :");
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
        bReader.close();
    }

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String txtFilename = ""; // args[1]
        String userDirectoryPath = System.getProperty("user.dir");

        dirPath = (args.length > 0)? args[0] : userDirectoryPath;
        txtFilename = (args.length == 2) ? args[1] : "SortedDirList.txt";
        String filePath = userDirectoryPath + "/Tasca5/S1_T05_n1exercici4/" + txtFilename;

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                try {
                    String header = displayDirectoryHeader(dirPath);
                    String dirContent = listDirContent(sortedDirFiles, 0);
                    writeDirectoryToFile(filePath, header, dirContent);
                    try {
                        File file = new File(filePath);
                        readAndShowTXT(file);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Hi ha hagut un problema al llegir el directori");
            }
        } else {
            System.out.println("The directory does not exist");
        }
    }
}
