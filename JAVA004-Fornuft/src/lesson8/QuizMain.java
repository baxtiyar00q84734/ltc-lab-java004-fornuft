package lesson8;

import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0, questionCount = 0;

        QuizGame[] questions = {
                new QuizGame("What is 2 + 2?\nA) 3\nB) 4\nC) 5", 'B', "Enter your answer: "),
                new QuizGame("What is the SI unit of force?\nA) Newton\nB) Watt\nC) Joule", 'A', "Enter your answer: "),
                new QuizGame("What is the largest planet in the solar system?\nA) Earth\nB) Jupiter\nC) Mars", 'B', "Enter your answer: "),
                new QuizGame("Who developed the theory of relativity?\nA) Isaac Newton\nB) Albert Einstein\nC) Stephen Hawking", 'B', "Enter your answer: "),
                new QuizGame("What is the square root of 144?\nA) 10\nB) 12\nC) 14", 'B', "Enter your answer: ")
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

            if (selectedQuestion.askQuestion()) {
                score++;
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
