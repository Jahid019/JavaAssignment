//5. Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5
import java.util.Arrays;

public class LinearSearch {

    public static int search(int[] arr, int n, int x){
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr= {1,6,9,3,5,4,7};
        Arrays.sort(arr);
        int x =5;
        int result = search(arr,arr.length,x);
        if (result== -1)
            System.out.println("Not present");
        else
            System.out.println("Element is at " + result);
        }

    }

