package lesson3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        int input1 = scanner.nextInt();

        //2-3
        if (input1 > 10) {
            System.out.println("its negation");
        } else {
            System.out.println("its original value");
        }

        //4
        if (input1 % 2 == 0) {
            System.out.println("its even");
        } else {
            System.out.println("its odd");
        }

        //5
        System.out.println("Enter decimal number:");
        double decimalInput = scanner.nextDouble();
        double sum = decimalInput + input1;
        System.out.println(sum);

        //6
        double rand = Math.random() * 10;
        sum+= rand + input1;
        System.out.println(sum);

        //7
        if (sum>20){
            System.out.println("its larger than 20");
        } else {
            System.out.println("its not larger than 20");
        }
    }
}
