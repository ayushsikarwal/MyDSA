import java.util.Stack;

class QueueWithStacks {

    public Stack<Integer> first;
    public Stack<Integer> second;

    public QueueWithStacks() {
        first = new Stack<>();
        second = new Stack<>();

    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        // Check if the queue is empty before peeking
        if (!second.isEmpty()) {
            return second.peek();
        }
        return -1;
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}