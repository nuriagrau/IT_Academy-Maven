package Tasca5.n1exercici4;

import Tasca5.n1exercici3.DirListText;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class DirListReadTXT {
    // TODO Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

    String fileName;

    public DirListReadTXT(String fileName) {
        this.fileName = fileName;
    }

    static class SortByName implements Comparator<DirListReadTXT> {
        public int compare(DirListReadTXT a, DirListReadTXT b) {
            return a.fileName.substring((a.fileName.contains("(F)"))? 5 : 2).compareTo(b.fileName.substring((b.fileName.contains("(F)"))? 5 : 2));
        }
    }

    public String toString() {
        return this.fileName;
    }

    public static void main(String[] args) {
        String directory = "/Users/macbookprodenuria/Documents/Fotos/2024/";
        ArrayList<DirListReadTXT> dir;

        try {
            dir = readDirectory(directory);
            Collections.sort(dir, new SortByName());
            String userDirectoryPath = System.getProperty("user.dir");
            String filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici4/SortedDirList.txt";
            try {
                File file = writeDirectoryToFile(filePath, dir);
                readAndShowTXT(file);
            } catch(IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Hi ha hagut un problema durant el procés d'escriptura al arxiu.");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés de lectura del directory");
        }
    }

    public static ArrayList<DirListReadTXT> readDirectory(String directory) throws IOException{
        ArrayList<DirListReadTXT> dir = new ArrayList<>();
        Stream<Path> filesPath = Files.walk(Paths.get(directory));
        for (Path path : filesPath.toList()) {
            Date dateLast = new Date(path.toFile().lastModified());
            if (path.toFile().isDirectory()) {
                dir.add(new DirListReadTXT("(D)" + path + " |Last Modified: " + dateLast));
            } else {
                dir.add(new DirListReadTXT("   (F)" + path + " |Last Modified: "  + dateLast));
            }
        }
        filesPath.close(); // close Stream
        return dir;
    }

    public static File writeDirectoryToFile(String filePath, ArrayList<DirListReadTXT> dir) throws IOException{
        File file = new File(filePath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)); // FileWriter creates a new file
        for (DirListReadTXT name : dir) {
            writer.write(name.fileName);
            writer.newLine();
        }
        return file;
    }
    public static void readAndShowTXT(File file) throws IOException{
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String string;
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
    }

}
