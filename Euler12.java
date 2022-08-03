public class Euler12 {

    public int factorCount(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }

        }

        return count;
    }

    public int calculateTriNumber(int number) {

        int triNumber = 0;
        for (int i = 1; i <= number; i++) {
            triNumber = triNumber + i;
        }
        return triNumber;
    }

    public static void main(String[] args) {

        Euler12 e12 = new Euler12();

        int number = 1;
        boolean found = false;

        do {
            int triNumber = e12.calculateTriNumber(number);
            int count = e12.factorCount(triNumber);
            System.out.println("Number " + triNumber + " Count - " + count);
            if (count > 500) {
                System.out.println("Tri Number - " + triNumber);
                found = true;
            }
            number++;

        } while (!found);

    }
}
