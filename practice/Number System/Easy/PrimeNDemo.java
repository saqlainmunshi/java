import java.util.Scanner;

public class PrimeNDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Creating object of PrimeChecker
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(number);

        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
