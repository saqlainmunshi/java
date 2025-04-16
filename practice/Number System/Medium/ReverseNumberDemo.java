import java.util.Scanner;

public class ReverseNumberDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = keyboard.nextInt();

        ReverseNumber reverse = new ReverseNumber();
        System.out.println("Reversed: " + reverse.reverse(num));

        keyboard.close();
    }
}
