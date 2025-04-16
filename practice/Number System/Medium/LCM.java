public class LCM {
    public int calculateLCM(int a, int b) {
        int last = a * b;  
        int first = (a > b) ? a : b; 

        for (int i = first; i <= last; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;  
            }
        }

        return last;  
    }
}
