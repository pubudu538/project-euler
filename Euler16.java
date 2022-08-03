import java.math.BigInteger;

public class Euler16 {

    public static void main(String[] args) {

        int power = 1000;

        BigInteger calValue = BigInteger.ONE;
        for (int i = 1; i <= power; i++) {

            calValue = calValue.multiply(BigInteger.valueOf(2));

        }

        System.out.println(calValue);

        String stValue = String.valueOf(calValue);
        System.out.println(stValue);

        int sum = 0;
        for (int i = 0; i < stValue.length(); i++) {
            String digit = stValue.substring(i, i + 1);
            sum += Integer.parseInt(digit);
        }

        System.out.println("Sum is " + sum);

    }
}
