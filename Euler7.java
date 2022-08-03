public class Euler7 {

    static void findPrimeNumber(int primeCount) {

        int counter = 0;
        int i = 1;
        System.out.println("Prime 1: 2");
        System.out.println("Prime 2: 3");

        while (counter < (primeCount - 2)) {

            int prime1 = 6 * i - 1;
            int prime2 = 6 * i + 1;
            int primeCount1 = counter + 3;
            int primeCount2 = counter + 4;
            System.out.println("Prime " + primeCount1 + ": " + prime1);

            if (primeCount1 == primeCount) {
                System.out.println("Found: " + prime1);
            }
            System.out.println("Prime " + primeCount2 + ": " + prime2);

            if (primeCount2 == primeCount) {
                System.out.println("Found: " + prime2);
            }

            counter += 2;
            i++;
        }

    }

    void primeSearch(int primeCount) {

        int counter = 3;
        int i = 4;
        System.out.println("Prime 1: 2");
        System.out.println("Prime 2: 3");

        while (counter <= primeCount) {

            if (isPrime(i)) {
                System.out.println("Prime " + counter + ": " + i);
                counter++;
            }

            i++;
        }
    }

    boolean isPrime(int number) {

        if (number == 0 || number == 1) {
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

    public static void main(String[] args) {

        Euler7 e7 = new Euler7();
        // e7.findPrimeNumber(100);
        e7.primeSearch(10001);


    }
}
