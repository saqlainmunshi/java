import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome: ");
        int num = keyboard.nextInt();

        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");

        }

        keyboard.close();
    }
}
