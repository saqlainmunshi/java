import java.util.Scanner;

public class LeapYearDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();

        LeapYear leap = new LeapYear();
        if(leap.isLeapYear(year)){
            System.out.println(year + " is a leap year "  );

        }else{

            System.out.println(year + " is not a leap year"  );
        }

        keyboard.close();
    }
}
