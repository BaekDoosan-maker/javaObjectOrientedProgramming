import java.util.ArrayDeque;

public class Collections_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(-1);
        System.out.println(arrayDeque);

        arrayDeque.push(22);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        arrayDeque.clear();
        System.out.println(arrayDeque.isEmpty());


    }
}
