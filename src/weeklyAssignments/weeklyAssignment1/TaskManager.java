package weeklyAssignments.weeklyAssignment1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public void markTaskCompleted(int index) {
        if (index >= 1 && index <= tasks.size()) {
            Task task = tasks.get(index - 1);
            task.setCompleted(true);
            System.out.println();
            System.out.println("Task marked as completed: " + task.getDescription());
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Invalid task index.");
            System.out.println();
        }
    }

    public void deleteTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            Task task = tasks.remove(index - 1);
            System.out.println();
            System.out.println("Deleted Task: " + task.getDescription());
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Invalid task index.");
            System.out.println();
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        if(!tasks.isEmpty()){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println();
            System.out.println((i + 1) + ". " + tasks.get(i));
            System.out.println();
        }}else{
            System.out.println();
            System.out.println("Empty, Please! Add some tasks");
            System.out.println();
        }
    }
}

