package enums;

public enum TrainingLevel {
    BEGINNER(1, "Beginner"),
    INTERMEDIATE(2, "rgetger"),
    ADVANCED(3, "advanced"),
    PROFESSIONAL(4, "Professional");

    private final int code;
    private final String displayName;

    TrainingLevel(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    

}
