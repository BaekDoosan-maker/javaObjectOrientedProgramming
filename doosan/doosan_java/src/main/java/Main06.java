import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main06 {
    public static void main(String[] args) {
       DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
       String myDate = myFormatter.format(LocalDate.now());
       System.out.println(myDate);
    }
}
