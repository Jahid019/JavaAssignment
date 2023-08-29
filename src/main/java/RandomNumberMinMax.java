//Generate random 10 integer numbers in an array and print out all the numbers from array
// and also print the max and min number from the array

import java.util.Arrays;
import java.util.Random;

public class RandomNumberMinMax {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();

        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("\nMaximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
}
