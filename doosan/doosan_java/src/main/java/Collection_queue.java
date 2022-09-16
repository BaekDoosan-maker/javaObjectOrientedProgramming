import java.util.LinkedList;
import java.util.Queue;

/**
 큐(queue)
 큐는 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO(First In Fist Out) 구조로 되어있습니다.
 큐의 예
 -은행 창구 줄서기 /인쇄 작업 대기 목록
 아래 그림을 통해 이해를 해보도록 하겠습니다! 큐는 양쪽 끝의 통로가 뚫려 있다고 생각하면 됩니다. 가장 먼저 들어온 Data 가 반환이
 될때도 가장 먼저 반환되는 것이죠!
 큐는 우선순위 큐, 원형 큐선순위 큐 , 원형 큐 등 다양하게 존재합니다. 자료 구조에 대해서 추후 공부하게 되면 하나씩
 만실 수 있습니다!
 */

/**
 ArrayDeque
 이번에는 ArrayDeque에 대해서 알아보겠습니다. 실무에서는 단순히 Stack, Queue 클래스 대신에
  ArrayDeque 많이 사용합니다! 기본 Stack, Queue 의 기능을 모두 포함하면서도 성능이 더 좋기 때문이죠
 deque
 - 우리가 앞서 배운 큐는 한쪽에서만 값이 삽입되고 다른 한쪽에서만 값을 반환하는 자료구조였습니다.
 하지만 deque의 경우 양 끝에서 삽입과 반환이 가능합니다
 -> 아래 사진은 deque 구조를 띄는 사진입니다. 정말 양 끝에서 삽입과 삭제가 이루어지고 있죠?
 우리가 예제로 확인해볼 ArrayDeque가 바로 이러한 형태입니다!
 */
public class Collection_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
