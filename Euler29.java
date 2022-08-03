import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Euler29 {

    public static void main(String[] args) {

        Set<BigInteger> numberList = new HashSet<BigInteger>();
        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j <= 100; j++) {

                BigInteger value = BigInteger.valueOf(i).pow(j);
                numberList.add(value);

            }
        }

     
        System.out.println("Sum is " + numberList.size());
    }
}
