import java.util.Scanner;

public class LCMDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int num2 = keyboard.nextInt();

        LCM lcmCalculator = new LCM();
        int lcm = lcmCalculator.calculateLCM(num1, num2);

        System.out.println("The LCM is = " + lcm);

        keyboard.close();
    }
}
