package lesson8;

import java.util.Scanner;

public class QuizGame {
    String questionText;
    char validAnswer;
    String answers;

    public QuizGame(String questionText, char validAnswer, String answers) {
        this.questionText = questionText;
        this.validAnswer = validAnswer;
        this.answers = answers;
    }

    boolean checkAnswer(char userAnswer) {
        return (userAnswer) == (validAnswer);

    }

    void displayQuestion() {
        System.out.println(questionText);
        System.out.println(answers);
    }

    boolean askQuestion() {
        displayQuestion();
        Scanner scanner = new Scanner(System.in);
        char userAnswer = scanner.next().charAt(0);
        if (checkAnswer(userAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect!");
            return false;
        }
    }


}
