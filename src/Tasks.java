public class Tasks implements Comparable<Tasks> {

    private Importance importance;
    private int priority;
    private String description;

    public Tasks(Importance importance, int priority, String description) {
        this.importance = importance;
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public Importance getImportance() {
        return importance;
    }

    @Override
    public int compareTo(Tasks task) {
        if (importance.getImportance() == task.importance.getImportance() && priority < task.priority) {
            return -1;
        } else if (importance.getImportance() < task.importance.getImportance()) {
            return -1;
        }
        return 2;
    }

    public String toString() {
        return "Importance:" + getImportance() + " Priority:" + getPriority() + " Description:" + getDescription();
    }

}
