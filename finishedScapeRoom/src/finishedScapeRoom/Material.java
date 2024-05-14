package finishedScapeRoom;

public enum Material {

    WOOD("Wood"), METAL("Metal"), GLASS("Glass"), PLASTIC("Plastic"), TEXTILE("Textile"), PLANT("Plant"), CARDBOARD("Cardboard"), PAPER("Paper"), LATEX("Latex");

    private final String value;

    Material(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static boolean findByValue(String value) {
        boolean found = false;
        for (Material m : values()) {
            if (m.getValue().equalsIgnoreCase(value)) {
                found = true;
            }
        }
        return found;
    }
}
