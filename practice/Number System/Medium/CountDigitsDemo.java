import java.util.Scanner;

public class CountDigitsDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        CountDigits counter = new CountDigits();
        System.out.println("Number of digits = " + counter.countDigits(num));

        keyboard.close();
    }
}
