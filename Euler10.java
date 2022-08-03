public class Euler10 {

    public boolean isPrimeNumber(int number) {

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

    public static void main(String[] args) {

        Euler10 e10 = new Euler10();
        long sum = 0;
        int limit = 2000000;
        // int limit = 10;
        for (int i = 0; i < limit; i++) {

            boolean prime = e10.isPrimeNumber(i);
            if (prime) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Sum is " + sum);

    }
}
