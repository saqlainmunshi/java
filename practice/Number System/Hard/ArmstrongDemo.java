import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        Armstrong armstrong = new Armstrong();
        if (armstrong.isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        keyboard.close();
    }
}
