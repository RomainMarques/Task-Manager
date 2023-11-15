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

    @Test
    public void testRemoveFromStackAndWrongId() {
        Task task = new Task("Description");
        Stack stack = new Stack();
        stack.addTask(task);
        stack.removeTask(0);

        // we remove the element of the list and checks that it throws an error bcs the list is empty
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stack.removeTask(0));
    }
}
