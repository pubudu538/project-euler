import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Aws_demo {

    public int findGCD(int[] numbers, int count) {

        if (numbers.length == 0 || count == 0) {
            return 0;
        }

        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < numbers.length; i++) {

            List<Integer> list = findFactors(numbers[i]);
            map.put(i, list);
        }

        int smallest = 100000000;
        int smallestKey = 0;
        for (Integer value : map.keySet()) {

            int listSize = map.get(value).size();

            if (listSize <= smallest) {
                smallest = listSize;
                smallestKey = value;
            }
        }

        List<Integer> smallestList = map.get(smallestKey);

        int greatestValue = 0;
        for (int j = 0; j < smallestList.size(); j++) {

            boolean available = false;
            for (Integer value : map.keySet()) {

                if (value == smallestKey) {
                    continue;
                }

                List<Integer> list = map.get(value);

                if (list.contains(smallestList.get(j))) {
                    available = true;
                } else {
                    available = false;
                    break;
                }
            }

            if (available && greatestValue < smallestList.get(j)) {
                greatestValue = smallestList.get(j);
            }

        }

        return greatestValue;
    }

    public List<Integer> findFactors(int number) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Aws_demo aws = new Aws_demo();
        int[] numbers1 = new int[] { 2, 3, 4, 5, 6 };
        int gcd = aws.findGCD(numbers1, 5);

        if (gcd == 1) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
        }

        int[] numbers2 = new int[] { 2, 4, 6, 8, 10 };
        gcd = aws.findGCD(numbers2, 5);

        if (gcd == 2) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed");
        }

        System.out.println(aws.findFactors(100));

    }
}
