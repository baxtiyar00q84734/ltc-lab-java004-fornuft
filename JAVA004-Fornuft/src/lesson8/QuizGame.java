package lesson8;

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


}
