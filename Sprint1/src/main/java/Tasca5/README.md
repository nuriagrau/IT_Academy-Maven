## **Commands for Console/Terminal**

### 1. *Go to directory where package is stored.*
To go write the command:

    cd [directory_path_to_package]

in my Mac it would be:

    cd IT_Academy/Maven/Sprint1/src/main/java

### 2. *Compile.*
To compile write in console/terminal:
    
    javac [packagePath/file.java]

in my Mac it would be:

    javac Tasca5/S1_T05_n1exercici5/examenScapeRoom.Main.java

### 3. *Run.* 
To run the program you can run it with some default values or with some specific values.
The general syntax is:

    java [packagePath/mainFile.java] <args[0]> <args[1]> <args[2]>

#### 3.1 - Default. 
This program can run with a default directory to read and default file names to write to (.txt and/or .ser):
          
    java Tasca5/S1_T05_n1exercici5/examenScapeRoom.Main.java

#### 3.2 - With args. 
The program can also run with 1, 2 or 3 arg.

#### . args[0]: directory to read. 
For n1exercici1 to n1exercici5. General syntax is:

    java [packagePath/mainFile.java] [directoryPath]

in my Mac it would be:
            
    java Tasca5/S1_T05_n1exercici5/examenScapeRoom.Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/

#### . args[0], args[1]: txtFile to write to. 
For n1exercici3 to n1exercici5. The file will be created in the n1exercici5 package. General syntax is:

    java [packagePath/mainFile.java] [directoryPath] [file.txt]

in my Mac an example would be:

    Tasca5/S1_T05_n1exercici5/examenScapeRoom.Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt

#### . args[0], args[1], args[2] serFile to write for serialization/deserialization. 
For n1exercici5 only. The files will be created in the n1exercici5 package. General syntax is:

    java [packagePath/mainFile.java] [directoryPath] [file.txt] [file.ser]

in my Mac an example would be:
            
    java Tasca5/S1_T05_n1exercici5/examenScapeRoom.Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt newTransporter.ser
