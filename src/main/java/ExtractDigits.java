//19. Extract the OTP from the SMS.
// "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

public class ExtractDigits {
    public static void main(String[] args) {
        String st =  "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
        String OTP =st.replaceAll("[^0-9]","").substring(0,6);
        System.out.println(OTP);
    }
}
