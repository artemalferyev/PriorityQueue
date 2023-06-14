public enum Importance {
    HIGH(1),
    MEDIUM(2),
    LOW(3);


    private int importance;

    Importance(int importance) {
        this.importance = importance;
    }

    public int getImportance() {
        return importance;
    }
}
