package examenScapeRoom;

public class Clue extends Element {

    private final int IVA = 10;

    private int estimatedTimeInSeconds;

    public Clue(String name, int estimatedTimeInSeconds) {
        super(name);
        this.estimatedTimeInSeconds = estimatedTimeInSeconds;
    }

    public int getEstimatedTimeInSeconds() {
        return this.estimatedTimeInSeconds;
    }

    public void setEstimatedTimeInSeconds() {
        this.estimatedTimeInSeconds = estimatedTimeInSeconds;
    }

    @Override
    public double priceCalculation(double rawPrice) {
        double price;
        price = rawPrice + (rawPrice * IVA / 100);
        return price;
    }

    @Override
    public String toString() {
        return " ";
    }

}
