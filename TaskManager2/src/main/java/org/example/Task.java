package org.example;

public class Task {
    private String description;
    private boolean done;
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description;
    }
}
