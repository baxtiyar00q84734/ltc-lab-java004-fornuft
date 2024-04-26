package lesson8;

import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0, questionCount = 0;

        QuizGame[] questions = {
                new QuizGame("What is the chemical symbol for water?\nA) H2O\nB) CO2\nC) O2", 'A', "Enter your answer: "),
                new QuizGame("How many planets are in our solar system?\nA) 7\nB) 8\nC) 9", 'B', "Enter your answer: "),
                new QuizGame("What is the capital of France?\nA) Berlin\nB) Madrid\nC) Paris", 'C', "Enter your answer: "),
                new QuizGame("What is 2 + 2?\nA) 3\nB) 4\nC) 5", 'B', "Enter your answer: "),
                new QuizGame("What is the SI unit of force?\nA) Newton\nB) Watt\nC) Joule", 'A', "Enter your answer: ")
        };
        while (true) {
            System.out.println("Choose a question to answer (1-" + questions.length + "):");
            for (int i = 0; i < questions.length; i++) {
                System.out.println((i + 1) + ". Question " + (i + 1));
            }

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > questions.length) {
                System.out.println("Invalid choice. Exiting.");
                return;
            }

            QuizGame selectedQuestion = questions[choice - 1];
            selectedQuestion.displayQuestion();
            char userAnswer = scanner.next().charAt(0);
            if (selectedQuestion.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            questionCount++;
            System.out.println("Your final score is: " + score + "/" + questionCount);
            System.out.println("Do you want to continue (if you want write quit)");
            String finishGame = scanner.next();

            if ("quit".equals(finishGame)) {
                break;
            }

        }
    }
}
