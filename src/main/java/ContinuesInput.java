//Write a program that will take integer numbers as user input continuously and print the sum of numbers
// until user input q from the keyboard. When user input q, program will be quit.
// If the user inputs another character,
// then the program will ask to input the number again.
import java.util.Scanner;

public class ContinuesInput {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter an integer (or 'q' to quit): " );
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }
            try {
                int number = Integer.parseInt(input);
                total+=number;
            } catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        System.out.println("Sum is "+ total);
        scanner.close();

    }
}
