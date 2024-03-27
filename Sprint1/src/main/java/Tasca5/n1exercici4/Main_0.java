package Tasca5.n1exercici4;

import java.io.*;
import java.util.ArrayList;


public class Main_0 {
    // TODO Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

    public static void main(String[] args) {
        String directory = "/Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/src/main/java";
        ArrayList<String> dir;

        try {
            dir = App_0.readDirectory(directory);
            dir.sort(new App_0.SortByName());
            String userDirectoryPath = System.getProperty("user.dir");
            String filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici4/SortedDirList4.txt";
            System.out.println("dir desde segon try" + dir);
            File file = App_0.writeDirectoryToFile(filePath, dir);
            App_0.readAndShowTXT(file);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés de lectura del directory");
        }
    }
}
