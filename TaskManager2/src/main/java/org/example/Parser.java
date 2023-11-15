package org.example;

public class Parser {

    public static void analyseLine(String input, Stack stack) {
        String[] userInput = input.split(" ", 2); // Split the input by the first char

        switch (userInput[0]) {
            case "+" -> stack.addTask(new Task(userInput[1]));
            default -> System.out.println("No character match.");
        }
    }
}
