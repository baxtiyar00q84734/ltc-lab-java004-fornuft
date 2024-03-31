package lesson_1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ilk teref:");
        int a=scanner.nextInt();
        System.out.println("Ikinci teref");
        int b=scanner.nextInt();

        int perimeter=2*(a+b);
        int area=a*b;
        System.out.println(perimeter);
        System.out.println(area);
    }


}