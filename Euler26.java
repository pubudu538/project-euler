
public class Euler26 {

    public boolean findRec(String value) {

        String doubleString = value + value;
        System.out.println(doubleString.indexOf(value, 1));
        if (doubleString.indexOf(value, 1) != value.length()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        double d = (double) 100000 / 983;
        System.out.println(d);

        Euler26 e26 = new Euler26();
        System.out.println(e26.findRec("abc"));
        System.out.println(e26.findRec("ebarrybarrybarry"));



    }
}
