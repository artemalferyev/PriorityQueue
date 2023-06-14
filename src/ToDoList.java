import java.util.PriorityQueue;

public class ToDoList {
    PriorityQueue<Tasks> tasksContainer = new PriorityQueue<>();

    public ToDoList() {
    }

    public void add(Importance importance, int priority, String description) {
        tasksContainer.add(new Tasks(importance, priority, description));
    }

    public boolean isEmpty() {
        return tasksContainer.isEmpty();
    }

    public Tasks remove() {
        return tasksContainer.poll();
    }
}





