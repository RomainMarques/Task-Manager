import org.example.Parser;
import org.example.Stack;
import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParserTest {
    @Test
    public void testAddNewTask() {
        Stack stack = new Stack();
        String symbol = "+";
        String descr = "Take a shower";
        String input = symbol + " " + descr;

        Parser.analyseLine(input, stack); // input = user input

        Assertions.assertEquals(descr, stack.getTask(0).getDescription());
    }

    @Test
    public void testRemoveTask() {
        Stack stack = new Stack();
        String input = "- 0";
        Task task = new Task("Test");

        stack.addTask(task);
        Parser.analyseLine(input, stack);

        Assertions.assertTrue(stack.isEmpty());
    }

        @Test public void testUpdateTaskToDone() {
        Stack stack = new Stack();
        String input = "x 0";
        Task task = new Task("Test");

        Parser.analyseLine(input, stack);

        Assertions.assertTrue(stack.getTask(0).isDone());
    }
}
