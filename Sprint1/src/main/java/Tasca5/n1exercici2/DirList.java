package Tasca5.n1exercici2;

import Tasca5.n1exercici1.DirContent;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class DirList {

        /* TODO Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el
        contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic
        dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.
        */
        String fileName;

        public DirList(String fileName) {
            this.fileName = fileName;
        }

        static class SortByName implements Comparator<DirList> {
            public int compare(DirList a, DirList b) {
                return a.fileName.substring((a.fileName.contains("(F)"))? 5 : 2).compareTo(b.fileName.substring((b.fileName.contains("(F)"))? 5 : 2));
            }
        }

        public String toString() {
            return this.fileName;
        }

        public static void main(String[] args) {
            String directory = "/Users/macbookprodenuria/Documents/Fotos/2024/";
            ArrayList<DirList> dir = new ArrayList<>();

            try {
                Stream<Path> filesPath = Files.walk(Paths.get(directory));
                for (Path path : filesPath.toList()) {
                    Date dateLast = new Date(path.toFile().lastModified());
                    if (path.toFile().isDirectory()) {
                        dir.add(new DirList("(D)" + path.toString() + " |Last Modified: " + dateLast));
                    } else {
                        dir.add(new DirList("   (F)" + path.toString() + " |Last Modified: "  + dateLast));
                    }
                }
                filesPath.close(); // close Stream
                Collections.sort(dir, new SortByName());
                dir.forEach(System.out::println);

            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Hi ha hagut un problema durant el procés.");
            }
        }
}

