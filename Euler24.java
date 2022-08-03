import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Euler24 {

    List<Long> list = new ArrayList<Long>();

    public void printPermutations(String str, String ans) {

        int length = str.length();

        if (length == 0) {
            list.add(Long.parseLong(ans));
        } else {

            for (int i = 0; i < length; i++) {

                char ch = str.charAt(i);

                String ros = str.substring(0, i) + str.substring(i + 1);

                printPermutations(ros, ans + ch);
            }
        }

    }

    public static void main(String[] args) {

        Euler24 e24 = new Euler24();
        e24.printPermutations("0123456789", "");

        Collections.sort(e24.list);

        System.out.println(e24.list.get(1000000 - 1));

    }
}
