import java.util.ArrayList;

class tracker {
    String name;
    Boolean isCompleted;
    static ArrayList<tracker> taskList = new ArrayList<>();

    public static void addToList(tracker task) {
        long startTime = System.nanoTime();

        taskList.add(task);
        System.out.println(task.name + " added to the list");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void markAsCompleted(tracker task) {
        long startTime = System.nanoTime();

        task.isCompleted = true;
        System.out.println(task.name + " marked as completed");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void removeFromList(tracker task) {
        long startTime = System.nanoTime();

        taskList.remove(task);
        System.out.println(task.name + " removed from list");

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }

    public static void DisplayAll() {
        long startTime = System.nanoTime();

        System.out.println("All Tasks:");
        for (tracker task : taskList) { 
            String status = task.isCompleted ? "Done" : "Not Done";
            System.out.println(task.name + " :: " + status);
        }

        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }
}

public class toDoList {
    public static void main(String[] args) {
        tracker task1 = new tracker();
        task1.name = "Wake up";
        task1.isCompleted = false;

        tracker task2 = new tracker();
        task2.name = "Read a book";
        task2.isCompleted = false;

        tracker task3 = new tracker();
        task3.name = "Play football";
        task3.isCompleted = false;

        tracker.addToList(task1);
        tracker.addToList(task2);
        tracker.addToList(task3);

        tracker.markAsCompleted(task1);
        tracker.markAsCompleted(task2);
        tracker.removeFromList(task1);

        tracker.DisplayAll();
    }
}

OUTPUT
Wake up added to the list
Execution time: 1085600 ns
Read a book added to the list
Execution time: 15400 ns
Play football added to the list
Execution time: 10000 ns
Wake up marked as completed
Execution time: 50600 ns
Read a book marked as completed
Execution time: 12600 ns
Wake up removed from list
Execution time: 37800 ns
All Tasks:
Read a book :: Done
Play football :: Not Done
Execution time: 4223500 ns
