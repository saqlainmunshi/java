import java.util.Scanner;

public class TableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        


        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        MultiplicationTable table = new MultiplicationTable();
        table.printTable(number);

        
    }
}
