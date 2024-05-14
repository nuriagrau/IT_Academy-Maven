package finishedScapeRoom;

public enum DifficultyLevel {

    VERYLOW("Very Low"), LOW("Low"), MEDIUM("Medium"), HIGH("High"), VERYHIGH("Very High");

    private final String value;

    DifficultyLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static boolean findByValue(String value) {
        boolean found = false;
        for (DifficultyLevel level : values()) {
            if (level.getValue().equalsIgnoreCase(value)) {
                found = true;
            }
        }
        return found;
    }
}
