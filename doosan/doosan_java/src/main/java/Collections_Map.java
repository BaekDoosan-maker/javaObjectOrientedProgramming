import java.util.HashMap;
import java.util.Map;

public class Collections_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"bery");
        map.put(3,"cherry");
        System.out.println(map);
        // key=value, key=value 이렇게 표현이 됩니다.
        System.out.println("1st in map: " + map.get(1));
        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("cherry"));

        map.clear();
        System.out.println(map);


    }
}
