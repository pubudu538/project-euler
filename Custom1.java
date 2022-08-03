public class Custom1 {

    public String findPattern(String value) {

        StringBuilder pattern = new StringBuilder();;

        if (value.length() == 0) {
            return pattern.toString();
        }

        if (value.length() == 1) {
            return value;
        }

        int counter = 0;
        char start = '0';
        for (int i = 0; i < value.length(); i++) {

            if (start == value.charAt(i)) {
                counter++;
            } else {

                if (i == 0) {
                    start = value.charAt(i);
                    counter++;
                } else {
                    pattern.append(String.valueOf(counter)+start);
                    start = value.charAt(i);
                    counter = 1;
                }

            }

        }

        pattern.append(String.valueOf(counter)+start);

        return pattern.toString();
    }

    public static void main(String[] args) {

        String value = "abbbcc";
        String expectedValue = "2a3b2c";

        Custom1 c1 = new Custom1();
        System.out.println(c1.findPattern(value));

    }

}
