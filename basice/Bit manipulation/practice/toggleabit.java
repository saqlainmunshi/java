public class toggleabit {
    public static void main(String[] args) {
        int n= 5;
        int pos =2;
        int bitMask = 1<<pos;
        if((n&bitMask)==0){
            System.out.println(n|bitMask);
        }else{
         bitMask = ~bitMask;
         System.out.println(n & bitMask);
        }

    }
}
