import java.util.Scanner;

public class SumOfPrimesDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = keyboard.nextInt();
        System.out.print("Enter end of range: ");
        int end = keyboard.nextInt();

        SumOfPrimes primeSum = new SumOfPrimes();
        System.out.println("Sum of prime numbers in the range: " + primeSum.sumOfPrimes(start, end));

        keyboard.close();
    }
}
