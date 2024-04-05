package Tasca5.S1_T05_n2exercici1;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class Main {
    // TODO Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.
    //  Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
    //  De l'exercici anterior, parametritza el següent:
    //  -Directori a llegir.
    //  -Nom i directori del fitxer TXT resultant.
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


    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String filePath = "";
        // Config file
        try {
            String configFilePath = "Sprint1/src/main/java/Tasca5/S1_T05_n2exercici1/Config.properties";
            FileInputStream propertiesInput = new FileInputStream(configFilePath);
            Properties properties = new Properties();
            properties.load(propertiesInput);
            dirPath = properties.getProperty(dirPath);
            filePath = properties.getProperty(filePath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = getSortedDirFiles(directory);
                try {
                    writeDirectoryToFile(filePath, displayDirectoryHeader(dirPath), listDirContent(sortedDirFiles, 0));
                } catch (IOException e) {
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
