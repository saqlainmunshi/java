
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        
         int result = A.compareTo(B);
        if (result > 0) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");}
            
            
            String results = A.substring(0, 1).toUpperCase() + A.substring(1);
        System.out.print(results+" ");
            String resultes = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(resultes);
            
            
    }
}



