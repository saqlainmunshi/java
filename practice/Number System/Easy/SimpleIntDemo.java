import java.util.Scanner;

public class SimpleIntDemo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Creating object of SimpleInterest
        SimpleInterest si = new SimpleInterest();
        double interest = si.calculate(principal, rate, time);

        System.out.println("Simple Interest: " + interest);

        

	}

}
