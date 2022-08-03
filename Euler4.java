public class Euler4 {

    public void findPalindrome(int start, int end) {

        int largest = 0;
        for (int i = start; i <= end; i++) {

            for (int j = i + 1; j <= end; j++) {

                int calculatedValue = i * j;

                boolean validPalindrome = isPalindrome(calculatedValue);

                if (validPalindrome) {
                    
                    System.out.println(calculatedValue);

                    if (largest < calculatedValue) {
                        largest = calculatedValue;
                    }
                }
            }

        }

        System.out.println("Largest - " + largest);
    }

    public boolean isPalindrome(int value) {

        String strValue = String.valueOf(value);
        char[] charValues = strValue.toCharArray();

        char[] newArr = new char[charValues.length];
        int counter = 0;
        for (int i = charValues.length - 1; i >= 0; i--) {

            newArr[counter++] = charValues[i];

        }

        String newValue = new String(newArr);
        int newInt = Integer.parseInt(newValue);

        if (newInt == value) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Euler4 e4 = new Euler4();
        e4.findPalindrome(100, 999);
    }
}
