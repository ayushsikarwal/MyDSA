import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//
////        stack.pop();
////        stack.pop();
//
//        System.out.println(stack);
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(11);
        deque.addFirst(10);
        deque.addLast(12);

        System.out.println(deque );

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);


    }
}
