public class Euler9 {

    public static void main(String[] args) {

        for (int i = 3; i < 1000; i++) {

            for (int j = i + 1; j < 1000; j++) {

                for (int k = j + 1; k < 1000; k++) {

                    int sqrt = i * i + j * j;
                    if (i + j + k == 1000 && sqrt == (k * k)) {

                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        System.out.println(i * j * k);

                        System.exit(1);

                    }
                }
            }
        }

    }
}
