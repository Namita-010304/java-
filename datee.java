import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.LocalDateTime;


public class datee{
    public static void LocalDateTimeApi() {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate da = LocalDate.of(2004, 3, 4);
        System.out.println(da);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        Month month = current.getMonth();
        int seconds = current.getSecond();
        int day = current.getDayOfMonth();

        LocalDateTime d1 = current.withDayOfMonth(26).withYear(2004);
        System.out.println(d1);

        DateTimeFormatter mat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String date = current.format(mat);
        System.out.println(date);
    }

    public static void main(String[] args) {
        LocalDateTimeApi();
    }
}
