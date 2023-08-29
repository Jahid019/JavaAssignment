//8. Print the prime numbers of 2 to 100 9.
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        for(int number=2;number<=100;number++){
            if(checkPrime(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean checkPrime(int num) {
        boolean Prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
        return Prime;
    }
}
