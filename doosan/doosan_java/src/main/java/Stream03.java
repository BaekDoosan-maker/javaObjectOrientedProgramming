import java.util.Arrays;
import java.util.stream.Stream;

public class Stream03 {
    public static void main(String[] args) {
        String[] arr = {"SQL","Java","Python"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);
    }
}
