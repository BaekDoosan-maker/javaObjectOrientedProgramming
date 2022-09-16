

/**
 Collection은 모든 자료구조가 구현(implement) 하는 인터페이스입니다. 아래 배우는 모든 자료구조에 해당하는 클래스, 인터페이스는 언제나
 Collection 인터페이스를 구현하고 있습니다.
 1. List : 순서가 있는 데이터의 집합이며 데이터의 중복을 허용합니다.
 -> ArrayList, LinkedList, Stack 등
 2. Set : 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않습니다.
 -> HashSet, TreeSet 등
 3. Map : 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합입니다. 순서는 유지되지 않으며 키는 중복을 허용되지 않고 값은 중복을 허용합니다.
 -> HashMap, TreeMap 등
 4. Stack : 마지막에 넣은 데이터를 먼저 꺼내는 자료구조 입니다. LIFO(Last In First Out)
 -> Stack, ArrayDeque 등
 5. Queue: 먼저 넣은 데이터를 먼저 꺼내는 자료구조 입니다. FIFO(First In First Out)
 -> Queue, ArrayDeque 등
 컬렉션 인터페이스에는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 데이터를 다루는데  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);
        integerList.add(11);
        integerList.add(10);
        System.out.println(integerList);
        // 우리가 넣어주었던 순서대로 출력되는것을 볼수있다.
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(integerList.size());

        integerList.remove(4);
        System.out.println(integerList);

        //for(int i=0; i<integerList.size(); i++){
          //  System.out.println(integerList.get(i));
       // }
        for(int current: integerList){
            System.out.println(current);
        }
        // 위에랑 똑같은 결과 노출됨 1 4 5 10

    }
}
