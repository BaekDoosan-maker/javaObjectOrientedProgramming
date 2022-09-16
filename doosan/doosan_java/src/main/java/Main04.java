import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main04 {
    public static void main(String[] args) {
        // 자바 타임 패키지 날짜와 시간
        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of() usage");
        LocalDate dateOf = LocalDate.of(2021,3,30);
        LocalTime timeOf = LocalTime.of(22,50,0);
        System.out.println(dateOf);
        System.out.println(timeOf);


    }
}
