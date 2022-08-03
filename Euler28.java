import java.util.ArrayList;
import java.util.List;

public class Euler28 {

    public static void main(String[] args) {

        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();

        leftList.add(1);

        for (int i = 3; i <= 1001; i += 2) {

            int topRight = i * i;
            int topLeft = topRight - (i - 1);
            int bottomLeft = topLeft - (i - 1);
            int bottomRight = bottomLeft - (i - 1);

            rightList.add(topRight);
            rightList.add(bottomLeft);
            leftList.add(topLeft);
            leftList.add(bottomRight);

        }

        int leftSum = 0;
        for (int i = 0; i < leftList.size(); i++) {
            System.out.println(leftList.get(i));
            leftSum += leftList.get(i);
        }

        int rightSum = 0;
        for (int i = 0; i < rightList.size(); i++) {
            System.out.println(rightList.get(i));
            rightSum += rightList.get(i);
        }
        System.out.println(leftSum + rightSum);

    }

}
