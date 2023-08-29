//12. Write a program that will shuffle (values ​​will randomly change their position) from the given array
//
//numbers =[1,2,3,4,5,6,7,8,9,0]

import java.util.Arrays;
import java.util.Random;

public class ShuffleArraysRandomly {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7,8,9,0};
        Random rand = new Random();
        for(int i =0;i<arr.length;i++){
            int randomIndex = rand.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex]= arr[i];
            arr[i]= temp;

        }
        System.out.println("Random Output: "+Arrays.toString(arr));
    }
}
