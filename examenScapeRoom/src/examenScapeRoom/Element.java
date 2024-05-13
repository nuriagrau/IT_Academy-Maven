package examenScapeRoom;

public abstract class Element {

    protected int Id;
    protected static int nextId;
    protected String name;
    protected double price;


    public Element(String name) {
        this.Id = nextId;
        nextId++;
        this.name = name;
    }


    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract double priceCalculation(double rawPrice);


    @Override
    public String toString() {
        return " ";
    }

}
