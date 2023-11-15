package com.taskmanager.process;

import com.taskmanager.process.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCreationTask() {
        String expectedDescription = "Test Description";
        Task task = new Task(expectedDescription);
        boolean expectedState = false;

        Assertions.assertEquals(expectedDescription, task.getDescription());
        Assertions.assertEquals(expectedState, task.isDone());
    }

    @Test
    public void testSetTaskDone() {
        String description = "Test Description";
        Task task = new Task(description);
        boolean expected = true;

        task.setTaskDone();

        Assertions.assertEquals(expected, task.isDone());
    }

    @Test
    public void testSetTaskToDo() {
        String description = "Test Description";
        Task task = new Task(description);
        boolean expected = false;

        task.setTaskDone();
        task.setTaskToDo();

        Assertions.assertEquals(expected, task.isDone());
    }
}
