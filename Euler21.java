import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Euler21 {

    public List<Integer> findFactors(int number) {

        List<Integer> list = new ArrayList<Integer>();
        if (number == 0) {
            list.add(0);
            return list;
        }

        if (number == 1) {
            list.add(1);
            return list;
        }

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Euler21 e21 = new Euler21();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 2; i < 10000; i++) {

            List<Integer> factorList = e21.findFactors(i);

            int factorSum = 0;
            for (int j = 0; j < factorList.size(); j++) {
                factorSum += factorList.get(j);
            }

            if (factorSum == i) {
                continue;
            }

            List<Integer> newFactorList = e21.findFactors(factorSum);
            int newFactorSum = 0;
            for (int j = 0; j < newFactorList.size(); j++) {
                newFactorSum += newFactorList.get(j);
            }

            if (newFactorSum == i) {
                set.add(i);
                set.add(newFactorSum);
            }

        }

        int sum = 0;
        for (Integer val : set) {
            sum += val;
        }

        System.out.println("Sum is " + sum);

    }
}
