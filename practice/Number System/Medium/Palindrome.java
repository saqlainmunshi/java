public class Palindrome {
    public boolean isPalindrome(int num) {
        int rev = 0,temp=num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return temp == rev;
    }
}
