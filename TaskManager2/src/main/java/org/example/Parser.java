package org.example;

public class Parser {

    public static void analyseLine(String input, Stack stack) {
        String[] userInput = input.split(" ", 2); // Split the input by the first char

        switch (userInput[0]) {
            case "+" -> stack.addTask(new Task(userInput[1]));
            case "-" -> {
                try {
                    int id = Integer.parseInt(userInput[1]);
                    stack.removeTask(id);
                } catch (Exception e) {
                    if (e instanceof NumberFormatException)
                        System.out.println("Wrong string given");
                    else if (e instanceof IndexOutOfBoundsException)
                        System.out.println("ID given is not in the tasks list");
                    else
                        System.out.println("Unexpected error occurred");
                }
            }
            default -> System.out.println("No character match.");
        }
    }
}
