public class Euler30 {

    public static void main(String[] args) {

        int totalSum = 0;
        for (int i = 2; i <= 10000000; i++) {

            String val = String.valueOf(i);

            int sum = 0;
            for (int j = 0; j < val.length(); j++) {

                String subs = val.substring(j, j+1);
                int base = Integer.parseInt(subs);
                sum += (int) Math.pow(base, 5);
            }

            if (sum == i) {
                System.out.println(i);
                totalSum += sum;
            }
        }

        System.out.println("Total sum is " + totalSum);
    }
}
