import java.math.BigInteger;
import java.util.*;

public class bigint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        String numStr1 = scanner.nextLine();
        BigInteger num = new BigInteger(numStr);
        BigInteger num2 = new BigInteger(numStr1);
        System.out.println(num.add(num2));
        System.out.println(num.multiply(num2));

    }

}
