package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please add the count of your grocery list");
        int itemCount=scanner.nextInt();
        scanner.nextLine();
        String[] groceryList=new String[itemCount];

        for (int i = 0; i < groceryList.length; i++) {
            groceryList[i]=scanner.nextLine();
        }


// enhanced for
        for (String item : groceryList){
            System.out.println(item);
        }
        
//    to string method
        System.out.println(Arrays.toString(groceryList));

    }
}
