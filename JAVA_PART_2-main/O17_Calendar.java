import java.util.Calendar;
import java.util.TimeZone;

public class O17_Calendar {
    public static void main(String[] args) {
        Calendar obj = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));

        System.out.println(obj.getCalendarType());
        System.out.println(obj.getTimeZone());
        System.out.println(obj.getTime());
        System.out.println(obj.get(Calendar.DATE));
        System.out.println(obj.get(Calendar.MONTH));
        System.out.println(obj.get(Calendar.YEAR));
        System.out.println(obj.get(Calendar.HOUR));
        System.out.println(obj.get(Calendar.MINUTE));
        System.out.println(obj.get(Calendar.SECOND));
    }
}
