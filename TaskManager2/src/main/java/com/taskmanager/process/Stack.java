package com.taskmanager.process;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Task> tasks;

    public Stack() {
        tasks = new ArrayList<>();
    }

    public void displayTasks() {
        System.out.println("Tasks list: ");
        if(!isEmpty()) {
            for (int i = 0; i < tasks.size(); i++) {
                String out = " " + i + " [";
                out += tasks.get(i).isDone() ? "x]" : " ] ";
                System.out.println(out + " " + tasks.get(i).getDescription());
            }
        } else {
            System.out.println("No task yet");
        }
    }
    
    public void addTask(Task t) {
        tasks.add(t);
    }

    public Task getTask(int id) {
        return tasks.get(id); // id = index
    }

    public void removeTask(int id) {
        tasks.remove(id);
    }

    public boolean isEmpty() { return tasks.isEmpty(); }
}
