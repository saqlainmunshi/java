import java.util.Scanner;

public class SumOfDigitsDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        SumOfDigits sumDigits = new SumOfDigits();
        System.out.println("Sum of digits = " + sumDigits.sumOfDigits(num));

        keyboard.close();
    }
}
