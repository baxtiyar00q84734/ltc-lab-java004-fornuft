package lesson_1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double pi=Math.PI;
        System.out.println("Radiusu daxil edin:");
        double r=scanner.nextDouble();

        double l=2*pi*r;
        double s=pi*Math.pow(r,2);
        System.out.println(l);
        System.out.println(s);

    }

}
