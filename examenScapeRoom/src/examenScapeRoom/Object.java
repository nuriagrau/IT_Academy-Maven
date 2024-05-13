package examenScapeRoom;

public class Object extends Element{
    private final int IVA = 21;

    private Material material;

    public Object(String name, String material) {
        super(name);
        this.material = Enum.valueOf(Material.class, material);
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = Enum.valueOf(Material.class, material);
    }

    @Override
    public double priceCalculation(double rawPrice) {
        double price;
        price = rawPrice + (rawPrice * IVA/ 100);
        return price;
    }

    @Override
    public String toString() {
        return " ";
    }

}
