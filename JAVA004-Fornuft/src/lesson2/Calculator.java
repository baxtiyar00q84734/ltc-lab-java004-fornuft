package lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ilk reqemi daxil edin:");
        double n1=scanner.nextDouble();
        System.out.println("Ikinci reqemi daxil edin:");
        double n2=scanner.nextDouble();

        double sum=n1+n2;
        double product=n1*n2;
        double diff=n1-n2;
        double ratio=n1/n2;
        System.out.println("cem:"+sum);
        System.out.println("hasil:"+product);
        System.out.println("ferq:"+diff);
        System.out.println("nisbet:"+ratio);
    }
}
