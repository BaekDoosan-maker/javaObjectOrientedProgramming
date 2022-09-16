import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main08 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h/mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("현재시간: " + now);
    }
}
