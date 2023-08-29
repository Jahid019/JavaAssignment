//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be the same.
//Input: Civic
//Output: true
//Input: One
//Output: false
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("One"));
    }
    public static boolean checkPalindrome(String word) {
        StringBuilder rev = new StringBuilder();
        word = word.toLowerCase();
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            char letter = ch[i];
            rev.append(letter);
        }
        return rev.toString().equals(word);
    }
}
