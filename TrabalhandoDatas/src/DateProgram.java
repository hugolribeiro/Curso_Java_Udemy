import java.time.Instant;
import java.util.Date;

public class DateProgram {
    public static void main(String[] args) {
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(y3);
    }
}
