public class test {
    public static void main(String[] args) {
        String str ="im   saqlian     munshi";
        String[] words = str.trim().split(" ");
        
        for (String word : words) {
            System.out.println(word);
        }



//**********************************************
        
         System.out.println( str.replace(" ", ""));
//******************************************
// 8. trim()
System.out.println("Trimmed: '" + str.trim() + "'");
    }
}
