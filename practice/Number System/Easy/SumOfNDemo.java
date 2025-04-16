import java.util.Scanner;

public class SumOfNDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find sum : ");
        int n = scanner.nextInt();

        SumCalculator sumCalculator = new SumCalculator();
        int sum = sumCalculator.sumOfNaturalNumbers(n);

        System.out.println("Sum of first " + n + " natural numbers: " + sum);

    }
}
