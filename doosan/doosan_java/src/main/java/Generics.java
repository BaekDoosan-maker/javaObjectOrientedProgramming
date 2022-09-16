/**
 제네릭스
 제네릭스는 Java 에서 컬렉션을 사용하면 자주 볼 수 있습니다.
 제네릭스 개념과 예제를 공부하며 익혀보도록 하겠습니다.
 1) 제네릭스란?
 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능을 의미합니다.
 (이미 컬렉션을 배울대 한번 만나본적 있습니다.)
 제네릭스를 왜 사용해야 할까?
 -> 객체의 타입을 컴파일 시에 체크하기 때문에 안정성이 높아집니다.
 (의도하지 않은 타입의 객체가 저장되는 것을 막고 잘못된 형변환을 막을수 있기 때문입니다.)

 2) 제네릭스의 형식과 약어
 제네릭스의 형식
 public class 클래스명<T> {...}
 public interface 인터페이스명<T> {...}
 자주 사용되는 타입인자 약어
 - <T> == Type
 - <E> == Element
 - <K> == Key
 - <V> == Value
 - <N> == Number
 - <R> == Result
 제네릭스를 우리는 이미 사용하고 있었는데요, 제네릭스를 가장 잘 사용한 예제는 바로 Collection (또는 Collection 을 구현한
 다른 자료구조들)이랍니다. Collection 클래스를 살펴보면서 제네릭스가 어떻게 사용되었는지 확인해볼게요
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("string");
        Collection<String> collection = list;

        List<Exception> exceptionList = new ArrayList<>();
        Collection<Exception> exceptionCollection = exceptionList;

        List<IllegalArgumentException> exceptions = new ArrayList<>();
        exceptionCollection.addAll(exceptions);
        /**
         제네릭스 어떤 역할을 하는지 느낌이 오시나요?
         제네릭스 확인하면 동작은 같지만
         클래스 타입만 바뀌어야 하는 경우를 쉽게 다룰 수 있습니다.
         이러한 경우에 컴파일 언어의 타입 안정성까지 보장하면서도
         유연한 프로그램을 작성할 수 있는 장점이 있다는 걸 알아두시고요
         대표적으로 콜렉션이 있다.
         콜렉션에 있는 이런 클래스들이 나오면
         그때마다, 이런 함수들을 만날때마다 ex) containsALL
         윈도우는 ctrl + 클릭 을 통해서
         이러 명세를 확인하시면서 코딩을 하시면
         좀 더 여러분들 제네릭스에 대해서 이해하시고
         나중에는 제네릭스를 활용한 코딩까지 하실 수 있을 겁니다.
         */
    }
}
