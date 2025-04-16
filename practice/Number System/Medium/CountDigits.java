public class CountDigits {
    public int countDigits(int num) {
        int count = 0;
      if(num<0){ 
         num = num*-1;
      }

        if (num == 0) return 1; 

        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
