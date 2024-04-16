package lesson6;

public class LargestRandom {
    public static void main(String[] args) {


        int[] randArray = new int[10];

        for (int i = 0; i < 10; i++) {
            randArray[i] = (int) (Math.random() * 10) + 1;
            System.out.print(randArray[i] + " ");
        }

        int largestNum=randArray[0];

        for (int i = 1; i < randArray.length; i++) {

            if (randArray[i]>largestNum){
                largestNum=randArray[i];
            }
        }
        System.out.println("Largest: "+largestNum);

    }
}
