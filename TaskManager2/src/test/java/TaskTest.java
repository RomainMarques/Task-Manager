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
}
