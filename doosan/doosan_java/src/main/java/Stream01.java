import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        /**
         Stream 이라는 건 하나의 데이터 흐름이다.
         데이터를 여러개 표현한 것에서 흐름이 생기겠죠
         그래서 자연스럽게 우리가 배웠던 컬렉션을 이용해서
         스트림을 처리하는 경우가 많습니다.
         그래서 스트림을 활용해서 각 한 건 한 건 흘러들어오는 데이터에 대해서
         내가 어떤 처리를 할지를 좀 더 유연하게 코드로 작성할 수 있습니다.
         */

        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("japan");
        list.add("france");
        Stream<String> stream = list.stream();
        stream.map(str -> {
            System.out.println(str);
            return str.toUpperCase();

        }).forEach(System.out::println);

        System.out.println(list);
        Stream<String> stream2 = list.stream();
        /**
         스트림은 한가지 특징이 있는데 ,
         데이터 소스를 변경하지 않습니다.
         여기서 데이터 소스라는 건 원래 있는 이 리스트를 말하는거에요.
         */
    }

}
