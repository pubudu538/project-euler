import java.math.BigInteger;

public class Euler20 {

    public static void main(String[] args) {

        int number = 100;
        BigInteger sum = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        String val = String.valueOf(sum);

        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            count += Integer.valueOf(val.substring(i, i + 1));
        }

        System.out.println(sum);
        System.out.println(count);

    }
}
