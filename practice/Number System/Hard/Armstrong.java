public class Armstrong {
    public boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
