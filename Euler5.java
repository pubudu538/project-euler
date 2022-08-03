public class Euler5 {

    public void findSmallest(int start, int end) {

        int smallest = 0;
        int i = 1;
        while (smallest == 0) {
            for (int j = start; j <= end; j++) {

                if (i % j == 0) {

                    if (j == end) {
                        System.out.println("Completed - " + i);
                        smallest = i;
                    }
                    continue;
                } else {
                    break;
                }
            }

            i++;
        }

        System.out.println("Smallest - " + smallest);
    }

    public static void main(String[] args) {

        Euler5 e5 = new Euler5();
        e5.findSmallest(1, 20);

    }
}
