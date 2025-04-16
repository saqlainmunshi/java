import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = keyborad.nextInt();
        
        Factorial fact = new Factorial();
        System.out.println("Factorial of " + num + ": " + fact.factorial(num));
    }
}
