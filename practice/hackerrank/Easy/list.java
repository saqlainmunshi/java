import java.util.*;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read initial list size
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Read list elements
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {
            String command = sc.next();
            
            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                
                if (index >= 0 && index <= numbers.size()) { // Ensure valid index
                    numbers.add(index, value);
                }
            } 
            else if (command.equals("Delete")) {
                int index = sc.nextInt();
                
                if (index >= 0 && index < numbers.size()) { // Ensure valid index
                    numbers.remove(index);
                }
            }
        }

        // Print final list
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close(); // Close scanner
    }
}
