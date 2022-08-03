import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Euler32 {

    public List<Integer> isPandigit(int number) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 10000; i++) {

            int multiply = number * i;

            String sb = "";
            sb += String.valueOf(multiply);
            sb += String.valueOf(number);
            sb += String.valueOf(i);

            if (sb.length() == 9) {
                char[] arr = sb.toCharArray();
                Arrays.sort(arr);
                String newSt = new String(arr);

                if (newSt.equals("123456789")) {
                    System.out.println(number);
                    list.add(multiply);
                }
            }

        }

        return list;
    }

    public static void main(String[] args) {

        Euler32 e32 = new Euler32();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 1; i <= 10000; i++) {

            List<Integer> list = e32.isPandigit(i);

            if (list.size() > 0) {
                for (int k = 0; k < list.size(); k++) {

                    set.add(list.get(k));
                }
            }
        }

        int sum = 0;
        for (Integer val : set) {
            sum += val;
        }

        System.out.println("Sum is " + sum);

    }
}
