import java.math.BigInteger;

public class Euler25 {

    BigInteger n0 = BigInteger.ZERO, n1 = BigInteger.ONE;
    BigInteger count = BigInteger.ZERO;

    public void printFibo() {

        BigInteger temp;
        BigInteger n2 = n0.add(n1);
        temp = n1;
        n1 = n2;
        n0 = temp;

        if (String.valueOf(n2).length() == 1000) {
            System.out.println(n2);
            return;
        }

        printFibo();
        count = count.add(BigInteger.ONE);

    }

    public static void main(String[] args) {

        Euler25 e25 = new Euler25();

        e25.printFibo();
        System.out.println("Term - " + e25.count.add(BigInteger.TWO));
    }
}
