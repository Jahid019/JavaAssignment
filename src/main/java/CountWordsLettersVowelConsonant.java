//15. Count number of words , number of characters without spaces, number of vowels
// and consonant from the given string:
//"I live in Bangladesh"

import java.util.Arrays;

public class CountWordsLettersVowelConsonant {
    public static void main(String[] args) {
        String str = "I live in Bangladesh ";
        String[] words = str.split(" ");
        int finWord = words.length;
        System.out.println("Number of Words " + finWord);

        str = str.replaceAll("\\s", "");
        System.out.println("Number of Chars without Spaces " + str.length());

        str = str.toUpperCase();
        int vowel = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char[] ch = str.toCharArray();
            if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                vowel++;
            } else if ((ch[i] >= 'A' && ch[i] <= 'Z')) {
                consonant++;
            }

        }
        System.out.println("Number of Vowel " + vowel);
        System.out.println("Number of Consonant " + consonant);
    }
}
