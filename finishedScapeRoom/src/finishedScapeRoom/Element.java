package finishedScapeRoom;

public abstract class Element {

    protected int Id;
    protected static int nextId;
    protected String name;
    protected double rawPrice;
    protected double price;


    public Element(String name, double rawPrice) {
        this.Id = nextId;
        nextId++;
        this.name = name;
        this.rawPrice = rawPrice;
    }


    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public double getRawPrice() {
        return this.rawPrice;
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

    public void setRawPricePrice(double rawPriceprice){
        this.rawPrice = rawPrice;
    }

    public abstract double priceCalculation(double rawPrice);


    @Override
    public String toString() {
        return "Element[name=" + this.name + ", rawPrice=" + this.rawPrice + "]";
    }

}
