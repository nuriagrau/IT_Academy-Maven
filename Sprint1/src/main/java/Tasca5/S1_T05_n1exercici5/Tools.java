package Tasca5.S1_T05_n1exercici5;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Tools {

    public static File[] getSortedDirFiles(File directory) {
        File[] sortedDirFiles = directory.listFiles();
        Arrays.sort(sortedDirFiles);
        return sortedDirFiles;
    }

    public static String listDirContent(File[] sortedDirFiles, int level) {
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

    public static void writeDirectoryToFile(String filePath, String header, String dirContent) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(header);
            writer.newLine();
            writer.write(dirContent);
            writer.newLine();
            System.out.println("El contingut del directory s'ha guardat correctament a " + filePath);
        } catch (IOException e) {
            throw e;
        }
    }

    public static String displayDirectoryHeader(String dirPath) {
        String header = "";
        header = "\u007E" + dirPath;
        return header;
    }

    public static void readAndShowTXT(String txtFilename) throws Exception {
        File file = new File(txtFilename);
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String string;
        System.out.println(file.getName() + " content is :");
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
        bReader.close();
    }

    public static void startTeletransportation(String filename, Transporter object) {
        try (FileOutputStream file = new FileOutputStream(filename)){
            try (ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(object);
                System.out.println("Object has been serialized\n" + "Data before Deserialization: " + object.toString());
                // value change during process
                object.newTeletransportations_count();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        object = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            object = (Transporter) in.readObject();
            System.out.println("Object has been deserialized\n" + "Data after Deserialization: " + object.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
