package lesson2;
import java.util.Scanner;
public class CalculatorH {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hansini hesablamaq isteyirsiniz: sum/product/diff/ratio");
        String conditionCheck=scanner.nextLine();
        System.out.println("Ilk reqemi daxil edin:");
        double n1=scanner.nextDouble();
        System.out.println("Ikinci reqemi daxil edin:");
        double n2=scanner.nextDouble();


        if ("sum".equals(conditionCheck)){
            double sum=n1+n2;
            System.out.println(sum);
        }else if("product".equals(conditionCheck)){
            double product=n1*n2;
            System.out.println(product);
        }else if("diff".equals(conditionCheck)){
            double diff=n1-n2;
            System.out.println(diff);
        }else if("ratio".equals(conditionCheck)){
            double ratio=n1/n2;
            System.out.println(ratio);

        }

    }
}
