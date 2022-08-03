public class Euler2 {

    int n1 = 0, n2 = 1, n3 = 0;
    int total = 0;

    // 1,2,3,5,
    public void fibo(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (n3 > 4000000) {
                return;
            }
            System.out.println(n3 + " ");

            if (n3 % 2 == 0) {
                total += n3;
            }

            fibo(count - 1);

        }

    }



    public static void main(String[] args) {

        Euler2 e2 = new Euler2();
        // e2.fibo(10);
        e2.fibo(4000);
        System.out.println(e2.total);

    }
}
