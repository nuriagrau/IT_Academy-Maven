H1 **Commands for Console/Terminal running**
--
## 1. To start.
Go to directory where package is stored writing in console/terminal:

    cd <directory path to package>

in my Mac it would be:

    cd IT_Academy/Maven/Sprint1/src/main/java

## 2. Compile.
To compile write in console/terminal:

    javac <packagePath/file.java>   

in my Mac it would be:

    javac Tasca5/n1exercici5/Main.java

## 3. Run.
Args ara optional. To run the program write in console/terminal:

    java <packagePath/mainFile.java> arg1 arg2 arg3

### 3.1 - Default.
This program can run with a default directory to read and default file names to write to (.txt and/or .ser):

    java Tasca5/n1exercici5/Main.java 

### 3.2 - With args.
The program can also run with 1, 2 or 3 args.


**3.2.1 arg1: directory to read.**
For n1exercici1 to n1exercici5

    java <packagePath/mainFile.java> <directoryPath/>

in my Mac it would be:

    java Tasca5/n1exercici1/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/              


**3.2.2 arg1, arg2: txtFile to write to.**
For n1exercici3 to n1exercici5.The file will be created in the n1exercici5 package.

    java <packagePath/mainFile.java> <directoryPath/> <file.txt>               

in my Mac an example would be:

    Tasca5/n1exercici3/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt


**3.2.3 arg1, arg[1], arg[2]: serFile for serialization/deserialization.**
For n1exercici5 only. The files will be created in the n1exercici5 package.

    java <packagePath/mainFile.java> <directoryPath> <file.txt> <file.ser>

in my Mac an example would be:

    java Tasca5/n1exercici5/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt newTransporter.ser