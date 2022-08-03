import java.time.DayOfWeek;
import java.time.LocalDate;

public class Euler19 {

    public static void main(String[] args) {

        int sundays = 0;

        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {

                String m = String.valueOf(month);
                if (m.length() == 1) {
                    m = "0" + m;
                }
                DayOfWeek sunday = LocalDate.parse(year + "-" + m + "-01").getDayOfWeek();

                if (sunday == DayOfWeek.SUNDAY) {
                    sundays++;
                }

            }
        }

        System.out.println(sundays);
    }
}
