public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.add(Importance.MEDIUM, 1, "Sleep");
        toDoList.add(Importance.MEDIUM, 2, "Eat");
        toDoList.add(Importance.HIGH, 2, "Love");
        toDoList.add(Importance.HIGH, 4, "Pray");
        toDoList.add(Importance.LOW, 5, "Play");
        toDoList.add(Importance.MEDIUM, 3, "Code");

        while(!toDoList.isEmpty()){
            System.out.println(toDoList.remove());
        }
    }
}