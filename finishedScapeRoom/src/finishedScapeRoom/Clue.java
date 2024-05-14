package finishedScapeRoom;

public class Clue extends Element {

    private final int IVA = 10;

    private String topic;
    private int estimatedTimeInSeconds;

    public Clue(String name, double rawPrice, String topic, int estimatedTimeInSeconds) {
        super(name, rawPrice);
        this.topic = topic;
        this.estimatedTimeInSeconds = estimatedTimeInSeconds;
    }

    public String getTopic() {
        return this.topic;
    }
    public int getEstimatedTimeInSeconds() {
        return this.estimatedTimeInSeconds;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
        return "Clue [name=" + super.getName() + ", topic= " + this.topic + ", estimatedPriceInSeconds= " + this.estimatedTimeInSeconds + ", raw price=" + super.getRawPrice() + ", price with IVA=" + priceCalculation(super.getRawPrice()) +"]\n";
    }

}
