package lesson12.QuizGame;

import java.util.Scanner;
import java.util.TimerTask;

public class QuizGame {
    Scanner scanner = new Scanner(System.in);

    private String[] questions = {
            "What is the result of 5 * 5?",
            "Which of the following is a keyword in Java?",
            "What is the purpose of the 'finally' block in Java?",
            "What is the difference between '==' and '.equals()' in Java?",
            "What is the output of 'System.out.println(10 > 5 && 5 < 3)'?"
    };
    private String[][] options = {
            {"A. 20", "B. 25", "C. 30", "D. 35"},
            {"A. final", "B. if", "C. loop", "D. class"},
            {"A. To catch exceptions", "B. To execute code regardless of exceptions", "C. To handle errors", "D. To terminate the program"},
            {"A. '==' compares object references, '.equals()' compares the content", "B. They are identical", "C. '==' compares primitive types, '.equals()' compares objects", "D. '.equals()' is used for arithmetic operations"},
            {"A. true", "B. false", "C. Compilation error", "D. Runtime error"}
    };

    private char[] answers = {'B', 'A', 'B', 'C', 'B'};
    private int[] points = {1, 2, 3, 3, 2};
    private int score = 0;

    public void start() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D) or 'S' for skip: ");
            char answer = Character.toUpperCase(scanner.next().charAt(0)); //.

            if (answer == 'S') {
                System.out.println("Question skipped!");
                continue;
            }

            if (answer == answers[i]) {
                System.out.println("Correct!");
                score += points[i];
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + " of 11.");

    }
}
