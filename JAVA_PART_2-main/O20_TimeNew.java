import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class O20_TimeNew {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj);

        DateTimeFormatter change = DateTimeFormatter.ISO_WEEK_DATE;
        String date = change.format(obj);
        System.out.println(date);
    }
}
