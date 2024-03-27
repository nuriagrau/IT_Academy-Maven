package Tasca5.n1exercici4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class App_0 {

    public static class SortByName implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
           a = a.trim();
           b = b.trim();
           return a.substring(2).compareTo(b.substring(2));
        }
    }

    public static ArrayList<String> readDirectory(String directory) throws IOException {
        ArrayList<String> dir = new ArrayList<>();
        Stream<Path> filesPath = Files.walk(Paths.get(directory));
        int dirLevel = 0;
        int fileLevel = 0;
        int visited = 0;
        ArrayList<String> previousDir = new ArrayList<String>();
        previousDir.add(directory);
        System.out.println(previousDir);
        for(Path path : filesPath.toList()) {
            String levelIdentation = "";
            Date dateLast = new Date(path.toFile().lastModified());
            if (path.toFile().isDirectory()) {
                if (dir.size() == 0 || dirLevel == 0) {
                    dir.add(levelIdentation + "(D)" + path + " |Last Modified: " + dateLast + "dirLevel " + dirLevel);
                    previousDir.add(path.toString());
                    dirLevel++;
                }
                if (path.toString().contains(previousDir.get(dirLevel)) && (path.toString().contains(previousDir.get(dirLevel - 1)))) {
                    dirLevel++;
                    previousDir.add(path.toString());
                }
                if ((!(path.toString().contains(previousDir.get(dirLevel))) && (!(path.toString().contains(previousDir.get(dirLevel - 1)))))) {
                    dirLevel--;
                    previousDir.removeLast();
                    previousDir.removeLast();
                    previousDir.add(path.toString());
                }
                if (!(path.toString().contains(previousDir.get(dirLevel) )&& (path.toString().contains(previousDir.get(dirLevel - 1))))) {
                    previousDir.removeLast();
                    previousDir.add(path.toString());
                }
                for (int i = 0; i < dirLevel; i++) {
                    levelIdentation += " ";
                }
                dir.add(levelIdentation + "(D)" + path + " |Last Modified: " + dateLast + "dirLevel " + dirLevel);
                visited++;
            } else {
                if (dir.size() == 0) {
                    dir.add(levelIdentation + "(F)" + path + " |Last Modified: "  + dateLast + "level " + fileLevel + " v: " + visited);
                }
                fileLevel = dirLevel + 1;
                for (int i = 0; i < fileLevel; i++) {
                    levelIdentation += " ";
                }
                dir.add(levelIdentation + "(F)" + path + " |Last Modified: "  + dateLast + "level " + fileLevel + " v: " + visited);
                visited++;
            }
        }
        filesPath.close(); // close Stream
        return dir;
    }

    public static File writeDirectoryToFile(String filePath, ArrayList<String> dir) throws IOException{
        File newFile = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){ // FileWriter creates a new file
            for (String fileName : dir) {
                writer.write(fileName);
                writer.newLine();
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Hi ha hagut un problema durant el procés d'escriptura al arxiu.");
        }
        return newFile;
    }


    public static void readAndShowTXT(File file) throws IOException{
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String string;
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
    }
}
