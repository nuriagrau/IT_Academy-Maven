package examenScapeRoom;

import java.util.ArrayList;

public class Sala {

    private int Id;
    private static int nextId = 1;
    private String name;
    private DifficultyLevel difficultyLevel;
    private double totalValue;
    private ArrayList<Element> elements  = new ArrayList<>();

    public Sala(String name, String difficultyLevel){
        this.name = name;
        this.difficultyLevel = Enum.valueOf(DifficultyLevel.class, difficultyLevel);
        this.Id = nextId;
        nextId++;
    }

    public String getName() {
        return this.name;
    }

    public double getTotalValue() {
        return this.totalValue;
    }

    public ArrayList<Element> getElements(){
        return this.elements;
    }

    public DifficultyLevel getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = Enum.valueOf(DifficultyLevel.class, difficultyLevel);
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Sala [name= " + this.name + ", difficultyLevel= " + this.difficultyLevel + ", totalValue= " + totalValue;
    }





}
