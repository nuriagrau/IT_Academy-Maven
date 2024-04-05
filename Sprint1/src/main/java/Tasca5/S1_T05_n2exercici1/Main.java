package Tasca5.S1_T05_n2exercici1;

import java.io.*;
import java.util.Properties;
import static Tasca5.S1_T05_n2exercici1.Methods.*;

public class Main {
    // TODO Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.
    //  Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
    //  De l'exercici anterior, parametritza el següent:
    //  -Directori a llegir.
    //  -Nom i directori del fitxer TXT resultant.

    public static void main(String[] args) {
        String dirPath = "";// args[0]
        String filePath = "";
        int level = 0;

        try {
            // Config file link, inputStream and get properties
            String configFilePath = "Sprint1/src/main/java/Tasca5/S1_T05_n2exercici1/Config.properties";
            FileInputStream propertiesInput = new FileInputStream(configFilePath);
            Properties properties = new Properties();
            properties.load(propertiesInput);
            dirPath = properties.getProperty("dirPath");
            filePath = properties.getProperty("filePath");
            level = Integer.parseInt(properties.getProperty("level"));

            File directory = new File(dirPath);
            if (directory.exists()) {
                try {
                    File[] sortedDirFiles = getSortedDirFiles(directory);
                    try {
                        writeDirectoryToFile(filePath, displayDirectoryHeader(dirPath), listDirContent(sortedDirFiles, level));
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

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
