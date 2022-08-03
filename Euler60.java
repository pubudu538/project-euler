import java.math.BigInteger;

public class Euler60 {

    public boolean isPrime(BigInteger number) {


        if (number.compareTo(BigInteger.valueOf(2)) == -1) {
            return false;
        }

        if (number.compareTo(BigInteger.valueOf(2)) == 0) {
            return true;
        }

        if (number.mod(BigInteger.valueOf(2)) == BigInteger.valueOf(0)) {
            return false;
        }

        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(number.sqrt()) == -1
                || i.compareTo(number.sqrt()) == 0; i = i.add(BigInteger.valueOf(2))) {

            if (number.mod(i) == BigInteger.valueOf(0)) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        Euler60 e60 = new Euler60();
        int[] primeList = new int[] { 3, 7, 109, 673 };

        System.out.println("pd" + e60.isPrime(BigInteger.valueOf(673)));
        

        boolean primeFound = false;
        BigInteger number = BigInteger.valueOf(2);
        while (!primeFound) {

            if (e60.isPrime(number)) {

                boolean fifthPrimeFound = false;
                for (int i = 0; i < primeList.length; i++) {
                    String primeNumber = String.valueOf(primeList[i]);
                    String newNumber1 = primeNumber + String.valueOf(number);
                    String newNumber2 = String.valueOf(number) + primeNumber;

                    BigInteger bNum1 = new BigInteger(newNumber1);
                    BigInteger bNum2 = new BigInteger(newNumber2);

                    if (e60.isPrime(bNum1) && e60.isPrime(bNum2)) {
                        fifthPrimeFound = true;
                        continue;
                    } else {
                        fifthPrimeFound = false;
                        break;
                    }

                }

                if (fifthPrimeFound) {
                    System.out.println("Found - " + number);
                    primeFound = true;
                }

            }

            number = number.add(BigInteger.valueOf(1));
        }

        BigInteger sum = BigInteger.valueOf(792).add(number);
        System.out.println("Sum is " + sum);
    }
}
