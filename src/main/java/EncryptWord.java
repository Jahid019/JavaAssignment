//16. Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY
public class EncryptWord {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedText.append((char) ((c - base + shift) % 26 + base));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
    public static void main(String[] args) {
        String plaintext = "ROADTOSDET";
        int shift = 5;
        String encryptedText = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + encryptedText);
    }
}

