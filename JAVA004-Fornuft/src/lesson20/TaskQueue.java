package lesson20;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("Task 1: Write a simple calculator");
        taskQueue.add("Task 2: Take notes from lecture notes");
        taskQueue.add("Task 3: Watch Movie");

        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println(task);
        }
    }
}
