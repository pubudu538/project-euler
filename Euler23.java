import java.util.ArrayList;
import java.util.List;

public class Euler23 {

    public List<Integer> findFactors(int number) {

        List<Integer> list = new ArrayList<Integer>();

        if (number <= 0) {
            return list;
        }

        if (number == 1) {
            list.add(1);
            return list;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Euler23 e23 = new Euler23();
        

        List<Integer> abundantList = new ArrayList<Integer>();
        for (int i = 1; i <= 28123; i++) {
            List<Integer> factorList = e23.findFactors(i);

            int factorSum = 0;
            for (int j = 0; j < factorList.size(); j++) {
                factorSum += factorList.get(j);
            }

            if (factorSum > i) {
                abundantList.add(i);
            }
        }

        List<Integer> sumList = new ArrayList<Integer>();
        for (int j = 0; j < abundantList.size(); j++) {

            for (int k = j; k < abundantList.size(); k++) {

                int sum = abundantList.get(j) + abundantList.get(k);

                if (sum <= 28123) {
                    sumList.add(sum);
                }
            }
        }

        int finalSum = 0;
        for (int k = 1; k <= 28123; k++) {

            if (!sumList.contains(k)) {
                finalSum += k;
            }
        }

        System.out.println("Sum is " + finalSum);

    }
}


