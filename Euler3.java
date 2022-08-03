import java.math.BigInteger;

public class Euler3 {

    public void primeFactors(BigInteger number) {

        while ((number.mod(BigInteger.valueOf(2))).compareTo(BigInteger.valueOf(0)) == 0) {
            System.out.println(2 + " ");
            number = number.divide(BigInteger.valueOf(2));
        }

        for (int i = 3; 0 <= number.compareTo(number.sqrt()); i += 2) {

            while ((number.mod(BigInteger.valueOf(i))).compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println(i + " ");
                number = number.divide(BigInteger.valueOf(i));
            }
        }

        if (number.compareTo(BigInteger.valueOf(2)) == 1)  {
            System.out.println(number);
        }

    }

    public static void main(String[] args) {

        Euler3 e3 = new Euler3();
        BigInteger b = new BigInteger("600851475143");
        // BigInteger b = new BigInteger("20");
        e3.primeFactors(b);
    }
}
