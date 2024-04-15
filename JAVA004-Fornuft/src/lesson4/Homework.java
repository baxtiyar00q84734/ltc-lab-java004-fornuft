package lesson4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();

        String grade = null;


//        int age = 15;
//        String name = "";
//        name = age > 15 ? "Tural" : "Togrul";
//
//        // 90

        int r = score % 10;

        if (r == 0) {
            score--;
        }


        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";


            }

        } else {
            System.out.println("there is no letter for this grade.");
        }
        System.out.println("Your grade's letter is: " + grade);

    }
}
