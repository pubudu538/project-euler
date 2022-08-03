public class Euler6 {
    
    public void calculateDifference(int upperValue) {

        int squareSum = 0;
        int numberSum = 0;
        for(int i=1; i <= upperValue;i++) {

            int square = i*i;
            squareSum += square;

            numberSum += i;
        }

        int numberSumSquare = numberSum*numberSum;
        System.out.println(numberSumSquare-squareSum);


    }
    public static void main(String[] args) {

        Euler6 e6 =new Euler6();
        e6.calculateDifference(100);
    }
}
