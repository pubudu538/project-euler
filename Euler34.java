public class Euler34 {

    public int findFactorial(int number) {

        if (number == 0) {
            return 1;
        }

        if (number == 1 || number == 2) {
            return number;
        }

        int sum = 1;
        for (int i = number; i > 0; i--) {
            sum *= i;
        }

        return sum;

    }

    public int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        int y = x;
        for (int i = 1; i < x; i++) {
            y *= i;
        }
        return y;
    }

    public static void main(String[] args) {

        Euler34 e34 = new Euler34();

        int sum = 0;
        for (int i = 3; i < 50000; i++) {

            String sb = String.valueOf(i);
            int elementSum = 0;
            for (int j = 0; j < sb.length(); j++) {

                String st = sb.substring(j, j + 1);
                int facSum = e34.findFactorial(Integer.parseInt(st));
                elementSum += facSum;
            }

            if (elementSum == i) {

                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum is " + sum);

    }
}
