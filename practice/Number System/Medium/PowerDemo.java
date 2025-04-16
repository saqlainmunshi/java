import java.util.Scanner;

public class PowerDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = keyboard.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = keyboard.nextInt();

        Power power = new Power();
        System.out.println(base + "^" + exponent + " = " + power.power(base, exponent));

        keyboard.close();
    }
}
