import java.util.ArrayList;

public class toDoList {
    String name;
    Boolean isCompleted;  // Remove "static" - each task needs its own status
    static ArrayList<toDoList> taskList = new ArrayList<>();

    public static void addToList(toDoList task) {
        long startTime = System.nanoTime();

        taskList.add(task);
        System.out.println(task.name + " added to the list");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void markAsCompleted(toDoList task) {
        long startTime = System.nanoTime();

        task.isCompleted = true;  // Set the specific task's status
        System.out.println(task.name + " marked as completed");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void removeFromList(toDoList task) {
        long startTime = System.nanoTime();

        taskList.remove(task);
        System.out.println(task.name + " removed from list");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void DisplayAll() {
        long startTime = System.nanoTime();

        System.out.println("All Tasks:");
        for (toDoList task : taskList) {
            String status = task.isCompleted ? "Done" : "Not Done";
            System.out.println(task.name + " :: " + status);
        }

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        toDoList task1 = new toDoList();
        task1.name = "Wake up";
        task1.isCompleted = false;

        toDoList task2 = new toDoList();
        task2.name = "Read a book";
        task2.isCompleted = false;

        toDoList task3 = new toDoList();
        task3.name = "Play football";
        task3.isCompleted = false;

        addToList(task1);
        addToList(task2);
        addToList(task3);

        markAsCompleted(task1);
        markAsCompleted(task2);
        removeFromList(task1);

        DisplayAll();
    }
}

//OUTPUT
//Wake up added to the list
//Execution time: 957900 ns
//Read a book added to the list
//Execution time: 13800 ns
//Play football added to the list
//Execution time: 9200 ns
//Wake up marked as completed
//Execution time: 39900 ns
//Read a book marked as completed
//Execution time: 11700 ns
//Wake up removed from list
//Execution time: 35700 ns
//All Tasks:
//Read a book :: Done
//Play football :: Not Done
//Execution time: 5634300 ns
