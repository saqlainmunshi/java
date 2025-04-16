import java.util.Scanner;

public class StrongNumberDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        StrongNumber strongNumber = new StrongNumber();
        if (strongNumber.isStrongNumber(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }

        keyboard.close();
    }
}
