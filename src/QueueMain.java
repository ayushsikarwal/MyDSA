import com.sun.security.jgss.GSSUtil;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(9);
        queue.insert(4);
        queue.insert(18);
        queue.insert(77);
//        queue.insert(90);

//        queue.display();

//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.insert(133);
//        queue.insert(233);
//
        queue.display();
//
//        System.out.println(queue.printFront());
    }
}
