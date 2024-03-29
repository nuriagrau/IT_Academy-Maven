H1 **Commands for Console/Terminal**
--

###1. *Go to directory where package is stored. Write the command:*
    `cd <directory path to package>`

    in my GitHub repository it would be:
    
    `cd IT_Academy/Maven/Sprint1/src/main/java`

###2. *Compile. To compile write in console/terminal:*
   `javac <packagePath/file.java>`

    in my GitHub repository it would be:
    `javac Tasca5/n1exercici5/Main.java`

###3. *Run. To run the program write in console/terminal:*
    `java <packagePath/mainFile.java> optional<args[0] args[1] args[2]>`

    ####3.1 - Default. This program can run with a default directory to read and default file names to write to (.txt and/or .ser):
          `java Tasca5/n1exercici5/Main.java`

    ####3.2 - With args. The program can also run with 1, 2 or 3 args.

          #####. args[0]: directory to read. For n1exercici1 to n1exercici5

            `java <packagePath/mainFile.java> <directoryPath>`

            in my GitHub repository it would be:
            `java Tasca5/n1exercici5/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/`

          #####. args[0], args[1]: txtFile to write to. For n1exercici3 to n1exercici5.
            The file will be created in the n1exercici5 package.

            `java <packagePath/mainFile.java> <directoryPath> <file.txt>`

            in my GitHub repository an example would be:
            `Tasca5/n1exercici5/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt`

          #####. args[0], args[1], args[2] serFile for serialization/deserialization. For n1exercici5 only.
            The files will be created in the n1exercici5 package.

            `java <packagePath/mainFile.java> <directoryPath> <file.txt> <file.ser>`

            in my GitHub repository an example would be:
            `java Tasca5/n1exercici5/Main.java /Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/ newSortedDirList.txt newTransporter.ser`
