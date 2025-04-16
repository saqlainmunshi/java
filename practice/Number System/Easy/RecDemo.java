import java.util.Scanner;

public class RecDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		rec r1= new rec();
		System.out.println("enter frist number");
       r1.a = sc.nextInt();
		System.out.println("enter second number");
		 r1.b = sc.nextInt();
		System.out.println("the area is: "+r1.area());

	}

}
