import java.util.Scanner;

public class HCFDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int num2 = keyboard.nextInt();

        HCF hcfCalculator = new HCF();
        System.out.println("The HCF is = " + hcfCalculator.calculateHCF(num1, num2));

        keyboard.close();
    }
}
