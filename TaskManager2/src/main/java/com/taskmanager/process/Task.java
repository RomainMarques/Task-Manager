package com.taskmanager.process;

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

    public boolean isDone() {
        return done;
    }

    public void setTaskDone() {
        this.done = true;
    }
    public void setTaskToDo() {
        this.done = false;
    }
}
