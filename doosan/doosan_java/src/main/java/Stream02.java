import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("대구");
        list.add("서울");

        System.out.println(list);

        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("list -> transformation -> set");
        Set<String> set = list.stream()
                                .filter("서울"::equals)
                                .collect(Collectors.toSet());
        /**
         서울이랑 일치하는 자료만 남겼는데
         set은 중복을 허용하지 않는 자료구조이므로
         서울 하나만 출력됨
         */
        System.out.println(set);
    }
}
