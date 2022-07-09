import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int myRand = rand.nextInt(1, 100);
//        System.out.println("Random number between 1 and 100: " + myRand);
        System.out.println("Let the game begin!");
        System.out.println("Enter your name...");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int[] arr = new int[1];
        int[] arrOth;
        int i=0;
        while (true) {
            System.out.println("Enter the your number...");
            int yourNum = sc.nextInt();
            arrOth = arr;
            arr = new int[1+i];
            for (int j=0; j<arr.length-1; j++){
                arr[j]=arrOth[j];
            }
            arr[i++]=yourNum;
            if (yourNum > myRand) {
                System.out.println("Your number is too big. Please, try again.");
            } else if (yourNum < myRand) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Congratulations " + name);
                Arrays.sort(arr);
                System.out.println("Your numbers: " + Arrays.toString(arr));
                break;
            }


        }
    }
}
