public class countnumberof1 {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        while (n!=0) {
            if((n&1)==1){
                count++;
            }
           n= n >> 1;
        }
        System.out.println(count);
    }
}
