package Tasca5.n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // TODO Ara el programa ha de serialitzar un Objecte Java a un fitxer.ser i després l’ha de desserialitzar.
        // full path directory can be main args
        // args[0] directoryPath, args[1] new files directory, args[2] txtFilename, args[3] serFilename

        String dirPath = ""; // args[0]
        //String userDirectoryPath = "src/main/java";
        String filePath = "/Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/src/main/java/Tasca5/n1exercici5/";// args[1]
        String txtFilename = ""; // args[2]
        String serFilename = "";// args[3]

        switch(args.length) {
            case 0:
                dirPath = "/Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/src/main/java";// default args[0]
                //userDirectoryPath = System.getProperty("user.dir"); // default partial args[1]
                //filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici5/";// default args[1]
                txtFilename = "SortedDirList.txt"; // default args[2]
                serFilename = "Transporter.ser"; // default args[3]
                break;
            case 1:
                dirPath = args[0];
                //userDirectoryPath = System.getProperty("user.dir"); // default partial args[1]
                //filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici5/";// default args[1]
                txtFilename = "SortedDirList.txt"; // default args[2]
                serFilename = "Transporter.ser"; // default args[3]
                break;
            case 2:
                dirPath = args[0];
                //userDirectoryPath = System.getProperty("user.dir"); // default partial args[1]
                //filePath = userDirectoryPath + "/Sprint1/src/main/java/Tasca5/n1exercici5/";// default args[1]
                txtFilename = args[1]; // default args[2]
                serFilename = "Transporter.ser"; // default args[3]
                break;
            case 3:
                dirPath = args[0];
                txtFilename = args[1]; // default args[2]
                serFilename = args[2]; // default args[3]
                break;
        }


        txtFilename = filePath + txtFilename;
        serFilename = filePath + serFilename;

        File directory = new File(dirPath);
        if (directory.exists()) {
            try {
                File[] sortedDirFiles = n1exercici5_tools.getSortedDirFiles(directory);
                try {
                    String header = n1exercici5_tools.displayDirectoryHeader(dirPath);
                    String dirContent = n1exercici5_tools.listDirContent(sortedDirFiles, 0);
                    n1exercici5_tools.writeDirectoryToFile(txtFilename, header, dirContent);
                    try {
                        File file = new File(txtFilename);
                        n1exercici5_tools.readAndShowTXT(file);
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

        // Serialization and Deserialization of an object
        Transporter Spock = new Transporter("Spock", "Half-vulcan, Half-human", "Lieutenant commander", "Vulcan");
        n1exercici5_tools.startTeletransportation(serFilename, Spock);
    }

    //compile
    // macbookprodenuria@MacBook-MacBook-Pro-de-MacBook java % javac Tasca5/n1exercici5/Main.java
    // run
    // default
    // comands terminal macbookprodenuria@MacBook-MacBook-Pro-de-MacBook java % java Tasca5/n1exercici5/Main.java
    // all args
    // macbookprodenuria@MacBook-MacBook-Pro-de-MacBook java % java Tasca5/n1exercici5/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ SortedDirList1.txt Transporter1.ser
}
