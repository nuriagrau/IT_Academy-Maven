package S3_T01_n1exercici1;

import java.util.ArrayList;

public final class Undo {

    private static Undo instance;
    private ArrayList<String> commands;


    private Undo() {
        //Slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        this.commands = new ArrayList<String>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public ArrayList<String> getCommands() {
        return this.commands;
    }
    public void addCommand(String command) {
        this.commands.add(command);
    }

    public void removeCommand(String command) {
        int commandIndex = getCommandIndex(command);
        this.commands.remove(commandIndex);
    }

    public int getCommandIndex(String command) {
        int commandIndex = -1;
        while (commandIndex == -1 && this.commands.size() > 0) {
            for(int i = 0; i < this.commands.size(); i++) {
                if (this.commands.get(i).equalsIgnoreCase(command)) {
                    commandIndex = i;
                }
            }
        }
        return commandIndex;
    }

    public void listCommands() {
        for(String s: this.commands) {
            System.out.println(s);
        }
    }


}
