import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Set {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        integerSet.add(8);
        System.out.println(integerSet);
        // 내가 넣은 순서가 유지되지 않는다 1 2 3 8 9
        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New York");
        stringSet.add("LasVegas");
        stringSet.add("San Francisco");
        stringSet.add("Seoul");

        System.out.println(stringSet);
        stringSet.remove("Seoul");
        System.out.println(stringSet);

        List<String> target = new ArrayList<>();
        target.add("New York");
        target.add("LasVegas");
        stringSet.removeAll(target);
        System.out.println(stringSet);

        System.out.println("LA 포함되어있나요? " + stringSet.contains("LA"));
        System.out.println("LA 포함되어있나요? " + stringSet.contains("Seoul"));
        // boolean true false 를 리턴하는 함수

        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);
    }
}
