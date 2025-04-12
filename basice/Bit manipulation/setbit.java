public class setbit {
    public static void main(String[] args) {
         // set bit   will set the bit to 1 in give n at give position
         int n=5;
         int pos =1;
         int bitMask = 1<<pos;

         System.out.println(bitMask  | n);
        
    }
}
