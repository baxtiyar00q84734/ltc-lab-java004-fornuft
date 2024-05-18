package lesson14.ShapeChallenge;

import java.util.Scanner;

public class ShapeCalculator {
    private int score;

    public ShapeCalculator() {
        this.score = 0;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void playShapeGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape (rectangle, circle, triangle) or type 'quit' to end:");
            String shape = scanner.nextLine();

            if (shape.equalsIgnoreCase("quit")) {
                break;
            }

            double area = 0;

            switch (shape) {
                case "rectangle":
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    area = calculateArea(length, width);
                    break;
                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    area = calculateArea(radius);
                    break;
                case "triangle":
                    System.out.print("Enter side1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side3: ");
                    double side3 = scanner.nextDouble();
                    area = calculateArea(side1, side2, side3);
                    break;
                default:
                    System.out.println("Invalid shape!");
                    continue;
            }

            int points = calculatePoints(shape);
            score += points;
            System.out.println("Area of " + shape + ": " + area);
            System.out.println("You earned " + points + " points for this shape. Your total score is: " + score);
            scanner.nextLine();
        }

        System.out.println("Game Over! Your final score is: " + score);
        scanner.close();
    }

    private int calculatePoints(String shape) {
        switch (shape) {
            case "rectangle":
                return 3;
            case "circle":
                return 5;
            case "triangle":
                return 10;
            default:
                return 0;
        }
    }


}
