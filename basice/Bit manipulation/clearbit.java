public class clearbit {
    public static void main(String[] args) {
          // clear bit  will set the bit to 0 in give n  at give position
         int n=5;
         int pos =1;
         int bitMask = 1<<pos;
         bitMask = ~bitMask;

         System.out.println(bitMask  & n);
    }
}
