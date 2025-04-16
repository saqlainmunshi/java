public class SumOfPrimes {
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i  <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int sumOfPrimes(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
