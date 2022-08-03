import java.util.HashSet;
import java.util.Set;

public class Euler35 {

    public Set<Integer> list = new HashSet<Integer>();

    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean circularPrime(String number, int count) {

        if (count == 0) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(number.substring(1));
        sb.append(number.charAt(0));

        if (isPrime(Integer.parseInt(sb.toString()))) {
            circularPrime(sb.toString(), --count);
        } else {
            return false;
        }

        return true;

    }

    public void getCircularPrimeNumber(String number, int count) {

        if (count == 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(number.substring(1));
        sb.append(number.charAt(0));

        // System.out.println(sb.toString());

        if (sb.charAt(0) != '0') {
            System.out.println(sb.toString());
            list.add(Integer.parseInt(sb.toString()));
        }

        circularPrime(sb.toString(), --count);

    }

    public static void main(String[] args) {

        Euler35 e35 = new Euler35();

        // System.out.println(e35.isPrime(2));
        // System.out.println(e35.isPrime(11));
        // System.out.println(e35.isPrime(95));

        // e35.circularPrime("197", 2);

        for (int i = 1; i < 1000; i++) {

            if (e35.isPrime(i)) {

                String value = String.valueOf(i);

                if (value.length() >= 2) {
                    boolean circular = e35.circularPrime(value, value.length());

                    if (circular) {

                        e35.getCircularPrimeNumber(value, value.length());
                    }
                } else {
                    e35.list.add(i);
                }

            }
        }

        System.out.println("Count is " + e35.list.size());

    }
}
