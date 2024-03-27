package Tasca5.n1exercici1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class DirContent {
    //TODO Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
    String fileName;

    public DirContent(String fileName) {
        this.fileName = fileName;
    }

    static class SortByName implements Comparator<DirContent> {
        public int compare(DirContent a, DirContent b) {

            return a.fileName.compareTo(b.fileName);
        }
    }

    public String toString() {
        return this.fileName;
    }

    public static void main(String[] args) {
        String directory = "/Users/macbookprodenuria/Documents/Fotos/2024/Febrer_2024/";
        ArrayList<DirContent> dir = new ArrayList<DirContent>();
        try {
            Stream<Path> filesPath = Files.walk(Paths.get(directory));
            for (Path path : filesPath.toList()) {
                dir.add(new DirContent(path.toString()));
            }
            Collections.sort(dir, new SortByName());
            dir.forEach(System.out::println);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés.");
        }

    }
}