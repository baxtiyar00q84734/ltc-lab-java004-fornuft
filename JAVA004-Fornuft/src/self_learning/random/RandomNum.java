package self_learning.random;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt();// can be neg and pos
        System.out.println(a);
    }
}
