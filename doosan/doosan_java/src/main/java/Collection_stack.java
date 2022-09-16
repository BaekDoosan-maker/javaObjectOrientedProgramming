import java.util.Stack;

/**
 스택
 스택이란(stack)
 스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 자료구조료 입니다. 이것을 LIFO(Last In First Out) 라고 합니다.
 스택의 예
 웹브라우저의 앞페이지 이동 뒤페이지 이동 / 그릇 쌓기
 아래 그림을 보도록 하죠. 먼저 삽입된 값인 17이 가장 아래로, 이후 삽입되는 값은 그 위에 쌓이기 시작합니다.
 이후, pop()을 통해 값을 반환 할때도 마지막에 삽입된 값인 45가 가장 먼저 반환되죠!
 문서를 편집할때 뒤로가기 에 이렇게 되어있다.
 */
public class Collection_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println("size: " + stack.size());

        System.out.println(stack.contains(1));
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
