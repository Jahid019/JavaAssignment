//11. Find out the secondlargest element of the given array
//numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr ={5,3,9,7,4,1,8};
        Arrays.sort(arr); //first sorting the array

        System.out.println("The second largest number is  "+ arr[arr.length-2]); //largest number will be in the last index so
                                               // second last index will contain the second largest number
    }
}
