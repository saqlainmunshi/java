import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        a =a.toLowerCase();
        b =b.toLowerCase();
       for(int i=0;i<a.length();i++){
        char c= a.charAt(i);
        int count=0;
        for(int j=0;j<a.length();j++){
            if(c==a.charAt(j)){
                count++;
            }
        }
        for(int k=0;k<a.length();k++){
             if(c==b.charAt(k)){
                count--;
            }
        }
        if(count!=0){
            return false;
        }
       }
       return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
