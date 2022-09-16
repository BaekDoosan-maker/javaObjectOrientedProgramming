import java.time.LocalDate;
import java.time.Period;

public class Main07 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2020,1,1);
        Period period = Period.between(today,birthday);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
