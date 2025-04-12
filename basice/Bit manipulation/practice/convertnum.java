

public class convertnum {

    public static void decimalToBinary(int d) {
        String s = "";
        if (d == 0) {
            s = "0";
        } else {
            while (d > 0) {
                s = (d % 2) + s;
                d = d / 2;
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int dec = 7;
        int bin = 1101;
        convertnum obj = new convertnum();
        decimalToBinary(dec);
        obj.binaryToDecimal(bin);
    }

    void binaryToDecimal(int b) {
        int sum = 0;
        int i = 0;
        while (b > 0) {
            int dec = b % 10;
            sum = sum + (dec * (int) Math.pow(2, i));
            b = b / 10;
            i++;
        }

        System.out.println(sum);
    }
}
