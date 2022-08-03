public class Euler14 {

    public long countChains(long number) {

        long count = 1;
        if (number == 1) {
            return 1;
        }

        if (number % 2 == 0) {
            number /= 2;
        } else {
            number = 3 * number + 1;
        }
        return count += countChains(number);
    }

    public static void main(String[] args) {

        Euler14 e14 = new Euler14();

        long longest = 0;
        long longestNumber = 0;
        for (int i = 1; i <= 1000000; i++) {

            long count = e14.countChains(i);

            if (count > longest) {
                longest = count;
                longestNumber = i;
            }
        }

        System.out.println("Longest Number - " + longestNumber);
        System.out.println("Count - " + longest);
    }
}
