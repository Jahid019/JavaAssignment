//13. Take any number as input and print the reverse of the number
//input : 12345
//output: 54321
import java.util.Scanner;

public class ReverseAnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int ip = scanner.nextInt();
        int reverse = 0;
        while (ip != 0) {
            int rem = ip % 10;
            ip = ip / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}
