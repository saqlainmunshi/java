public class HCF {
    public int calculateHCF(int a, int b) {
        int last = (a > b) ? b : a;
        int result = 0;

        for (int i = 1; i <= last; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
