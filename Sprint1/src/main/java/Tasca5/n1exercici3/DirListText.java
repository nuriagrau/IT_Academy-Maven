package Tasca5.n1exercici3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class DirListText {
    /* TODO Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un
       fitxer TXT.
        */
    String fileName;

    public DirListText(String fileName) {
        this.fileName = fileName;
    }

    static class SortByName implements Comparator<DirListText> {
        public int compare(DirListText a, DirListText b) {
            return a.fileName.substring((a.fileName.contains("(F)"))? 5 : 2).compareTo(b.fileName.substring((b.fileName.contains("(F)"))? 5 : 2));
        }
    }

    public String toString() {
        return this.fileName;
    }

    public static void main(String[] args) {
        String directory = "/Users/macbookprodenuria/Documents/Fotos/2024/";
        ArrayList<DirListText> dir = new ArrayList<>();

        try {
            Stream<Path> filesPath = Files.walk(Paths.get(directory));
            for (Path path : filesPath.toList()) {
                Date dateLast = new Date(path.toFile().lastModified());
                if (path.toFile().isDirectory()) {
                    dir.add(new DirListText("(D)" + path + " |Last Modified: " + dateLast));
                } else {
                    dir.add(new DirListText("   (F)" + path + " |Last Modified: "  + dateLast));
                }
            }
            filesPath.close(); // close Stream
            Collections.sort(dir, new SortByName());
            String userDirectoryPath = System.getProperty("user.dir");
            String filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici3/SortedDirList.txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){ // FileWriter creates a new file
                for (DirListText file : dir) {
                    writer.write(file.fileName);
                    writer.newLine();
                }
            } catch(IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Hi ha hagut un problema durant el procés d'escriptura al arxiu.");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés de lectura del directory");
        }
    }
}
