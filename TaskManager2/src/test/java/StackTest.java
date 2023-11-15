import org.example.Stack;
import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void testAddStack() {
        Task task = new Task("Description");
        Stack stack = new Stack();
        stack.addTask(task);

        Assertions.assertEquals(task, stack.getTask(0));
    }
}
