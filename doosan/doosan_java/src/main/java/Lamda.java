import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 람다가 뭐냐면,
 함수를 좀 더 쉽게 표현하고 곧바로 표현하자 이런 의미인데요
 정확히 말하면, 함수의 명세
 이런것 없이도 함수를 정의하고 실행할 수 있는 함수입니다.
 문법이 간편하고 편리합니다.
 하지만 똑같은걸 또쓴다면 똑같은 코드를 또작성한다면 그떄는 함수로 만드는것을 생각하세요
 */
public class Lamda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("japan");
        list.add("france");
        Stream<String> stream = list.stream();
        stream.map(str -> {
                System.out.println(str);
                return str.toUpperCase();
                }).forEach(it -> System.out.println(it));
        /**
          map이란 함수는 '내가 앞에 있었던 어떤 값을 어떤 값으로 바꿀게' 라고 하는 역할을 해주고요
          forEach 는 '각각 하나하나마다 이런 구문을 실행해줘' 라는 겁니다.
          그래서 여기서 lamda 식은 정확이 뭐냐면,
          이렇게 이 앞에서 Stream이란 건 이 List에 있는 String을 하나씩 하나씩 꺼내주는 친구를 말해요
          하나씩 꺼냈을 때 그거를 변수로 지칭할 때
          난 요런 이름을 붙일거야 라는 겁니다. 이 꺾쇠 뒤에는 실제로 수행할 함수에 대한 내용을 쓰시면 됩니다.
         */
    }
}
