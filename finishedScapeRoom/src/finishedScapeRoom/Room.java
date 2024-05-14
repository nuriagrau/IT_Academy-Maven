package finishedScapeRoom;

import java.util.ArrayList;

public class Room {

    private int Id;
    private static int nextId = 1;
    private String name;
    private DifficultyLevel difficultyLevel;
    private double totalValue;
    private ArrayList<Element> elements;

    public Room(String name, String difficultyLevel){
        this.name = name;
        this.difficultyLevel = Enum.valueOf(DifficultyLevel.class, difficultyLevel);
        this.Id = nextId;
        nextId++;
        this.elements = new ArrayList<>();
    }

    public int getId() {
        return this.Id;
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

    public double totalValueCalculation(){
        double totalPrice = 0;
        for (Element e : this.elements) {
            totalPrice = totalPrice + e.priceCalculation(e.rawPrice);
        }
        return totalPrice;
    }

    public boolean addElement(Element element) {
        boolean addedElement = false;
        String elementName = element.getName();
        int elementIndex = getElementIndex(elementName);
        if (elementIndex == -1 || elements.size() == 0) {
            this.elements.add(element);
            addedElement = true;
        }
        return addedElement;
    }

    public boolean removeElement(int elementIndex) {
        boolean removedElement = false;
        if (elements.size() != 0) {
            this.elements.remove(elementIndex);
            removedElement = true;
        }
        return removedElement;
    }

    public int getElementIndex(String name) {
        boolean found = false;
        int elementIndex = -1;
        if (elements.size() > 0 && !found) {
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).getName().equalsIgnoreCase(name)) {
                    elementIndex = i;
                    found = true;
                }
            }
        }
        return elementIndex;
    }

    @Override
    public String toString() {
        return "Sala [name= " + this.name + ", difficultyLevel= " + this.difficultyLevel + ", totalValue= " + this.totalValueCalculation() + "]\n";
    }





}
