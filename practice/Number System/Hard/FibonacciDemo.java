import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = keyboard.nextInt();

        Fibonacci fib = new Fibonacci();
        System.out.println("The " + n + "th Fibonacci number is: " + fib.findFibonacci(n));

        keyboard.close();
    }
}
