
import java.util.Arrays;

public class Euler8 {

    public long calculateProduct(String number, int digits) {

        char[] arr = number.toCharArray();

        long highestValue = 0;
        for (int i = 0; i <= arr.length - digits; i++) {

            char[] newArr = Arrays.copyOfRange(arr, i, i + digits);

            if (newArr.length != digits) {
                System.out.println("Error - exiting");
                System.exit(1);
            }

            long digitValue = 1;
            boolean failed = false;
            for (int j = 0; j < newArr.length; j++) {

                String strValue = String.valueOf(newArr[j]);
                int intValue = Integer.parseInt(strValue);

                if (intValue > 9 || intValue < 0) {
                    System.out.println("Exiting - invalid");
                    System.out.println("Int is " + intValue);
                    System.exit(1);
                }

                if (intValue == 0) {
                    System.out.println("Digit value - " + digitValue);
                    failed = true;
                    break;
                }

                digitValue = digitValue * intValue;
            }

            if (!failed && highestValue < digitValue) {
                // System.out.println(newArr);
                String newst = new String(newArr);
                System.out.println("Arr - " + newst);
                System.out.println(digitValue);
                highestValue = digitValue;
            }

        }

        System.out.println("Highest Value is - " + highestValue);
        return highestValue;
    }

    public void pos(String s) {

        final int adjacentLength = 13;
        long largestProduct = 0;

        for (int i = 0; i < s.length() - adjacentLength + 1; i++) {
            long product = 1;

            for (int j = i; j < i + adjacentLength; j++) {
                product *= Integer.parseInt(s.substring(j, j + 1));
            }

            if (product > largestProduct)
                largestProduct = product;
        }
        System.out.println(largestProduct);
    }

    public static void main(String[] args) {

        String test = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        final int digits = 13;
        long highest = 0;
        for (int i = 0; i < test.length() - digits + 1; i++) {

            long productValue = 1;
            for (int j = i; j < i + digits; j++) {
                String st = test.substring(j, j + 1);
                productValue = productValue * Integer.parseInt(st);
            }

            if (productValue > highest) {
                highest = productValue;
            }
        }

        System.out.println("Highest - " + highest);

        Euler8 e8 = new Euler8();
        e8.pos(test);

        e8.calculateProduct(test, 13);

    }
}
