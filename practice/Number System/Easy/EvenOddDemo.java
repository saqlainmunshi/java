import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
int num;
Scanner keyboard = new Scanner(System.in);

EvenOdd eo= new EvenOdd();

System.out.println("enter a number");
num = keyboard.nextInt();
if(eo.isEven(num)) {
System.out.println("this is even number");
	}else
	{
		System.out.println("this is odd number");
	}

}}
