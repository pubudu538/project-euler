public class Euler1 {

    public int getSum(int value) {

        if (value == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < value; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                // System.out.println(i);
                total += i;
            }

        }

        return total;
    }

    public static void main(String[] args) {

        Euler1 e1 = new Euler1();

        System.out.println(e1.getSum(10));
        System.out.println(e1.getSum(1000));
    }
}
