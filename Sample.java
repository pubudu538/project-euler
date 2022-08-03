public class Sample {

    int n0 = 0, n1 = 1;

    public void fibo(int count) {

        if (count > 0) {

            int temp = n1;
            int n2 = n0 + n1;
            n1 = n2;
            n0 = temp;

            System.out.println(n2);
            fibo(--count);

        }
    }

    public boolean isPrime(int number) {

        if (number < 2) {
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

    public void primeFactors(int number) {

        while (number % 2 == 0) {

            System.out.println(2 + " ");
            number = number / 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }

        if (number > 2) {
            System.out.println(number + " ");
        }

    }

    public void printPermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutations(ros, ans + ch);
        }

    }

    public static void main(String[] args) {

        Sample sample = new Sample();
        sample.fibo(12);
        System.out.println(sample.isPrime(2));
        System.out.println(sample.isPrime(15));

        sample.primeFactors(147);

        sample.printPermutations("abc", "");

    }
}
