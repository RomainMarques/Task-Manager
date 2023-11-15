package com.taskmanager.util;

import com.taskmanager.process.Stack;
import com.taskmanager.process.Task;

public class Parser {

    public static boolean analyseLine(String input, Stack stack) {
        boolean exitApplication = false;

        String[] userInput = input.split(" ", 2); // Split the input by the first char

        switch (userInput[0]) {
            case "+" -> stack.addTask(new Task(userInput[1]));
            case "-" -> {
                try {
                    int id = Integer.parseInt(userInput[1]);
                    stack.removeTask(id);
                } catch (Exception e) {
                    raiseExceptionMessages(e);
                }
            }
            case "x" -> {
                try {
                    int id = Integer.parseInt(userInput[1]);
                    stack.getTask(id).setTaskDone();
                } catch (Exception e) {
                    raiseExceptionMessages(e);
                }
            }
            case "o" -> {
                try {
                    int id = Integer.parseInt(userInput[1]);
                    stack.getTask(id).setTaskToDo();
                } catch (Exception e) {
                    raiseExceptionMessages(e);
                }
            }
            case "q" -> exitApplication = true;
            default -> System.out.println("Error: No character match");
        }

        return exitApplication;
    }

    private static void raiseExceptionMessages(Exception e) {
        System.out.print("Error: ");
        if (e instanceof NumberFormatException)
            System.out.println("Wrong string given");
        else if (e instanceof IndexOutOfBoundsException)
            System.out.println("ID given is not in the tasks list");
        else
            System.out.println("Unexpected error occurred");
    }
}
