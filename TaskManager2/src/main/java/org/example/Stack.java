package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Task> tasks;

    public Stack() {
        tasks = new ArrayList<>();
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

    public boolean isEmpty() { return tasks.isEmpty();}
}
