package comparator.uzd3;

public enum ErrorLevels {
    HIGH(2),
    MEDIUM(1),
    LOW(0);

    private int level;

    ErrorLevels(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
