import java.util.TimeZone;

public class O18_TimeZone {
    public static void main(String[] args) {
        for (int i = 0; i < 631; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
