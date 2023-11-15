import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testCreationTask() {
        String expected = "Test Description";
        Task task = new Task(expected);

        Assertions.assertEquals(expected, task.getDescription());
    }

    @Test
    public void testInitialStateTask() {
        String description = "Test Description";
        Task task = new Task(description);
        boolean expected = false;

        Assertions.assertEquals(expected, task.isDone());
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
