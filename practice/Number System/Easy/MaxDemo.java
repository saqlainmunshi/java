import java.util.Scanner;

public class MaxDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Max m1 = new Max();
		System.out.println("enter frist number");
		int a = keyboard.nextInt();
		System.out.println("enter second number");
		int b = keyboard.nextInt();
		m1.intMax(a, b);
		

	}

}
