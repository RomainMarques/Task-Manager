package com.taskmanager;

import com.taskmanager.process.Stack;
import com.taskmanager.util.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean quitApplication = false;
        Stack stack = new Stack();

        System.out.println("How to use the app:\n" +
                "+ <description> to add a new task\n" +
                "- <id> to remove a task\n" +
                "x <id> set the status of the tasks to \"done\"\n" +
                "o <id> set the status of the tasks to \"to-do\"\n" +
                "q exit the application");

        Scanner sc = new Scanner(System.in);

        while (!quitApplication) {
            System.out.print("\nYour input: ");
            String line = sc.nextLine();

            quitApplication = Parser.analyseLine(line, stack); // Process the given line
            stack.displayTasks(); // Display all tasks
        }

        System.out.println("Leaving application, see you soon!");
    }
}