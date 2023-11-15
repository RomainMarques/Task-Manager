import org.example.Parser;
import org.example.Stack;
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
}
