class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node() {

    }
}


public class LL {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;

        node5.data = 5;

        addLast(node1, node5);

        Node node0 = new Node(0);

        node0.next = node1;

//         printAllRecursive(node0);
        printAllNodes(node0);
        printAllRecursiveReverse(node0);

    }

    public static void addLast(Node head, Node toBeAdded) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = toBeAdded;
    }

    public static void printAllNodes(Node head) {
        Node node = head;

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    // printAllRecursive(1); 1 
    // printAllRecursive(2); 2
    // printAllRecursive(3); 3
    // printAllRecursive(4); 4

    public static void printAllRecursive(Node node) {
        System.out.println(node.data);
        if(node.next != null) {
            printAllRecursive(node.next);
        }
    }

    public static void printAllRecursiveReverse(Node node) {
        if(node.next != null) {
            printAllRecursiveReverse(node.next);
        }
        System.out.println(node.data);
    }

    // printAllRecursiveReverse(1); 
    // printAllRecursiveReverse(2);
    // printAllRecursiveReverse(3);
    // printAllRecursiveReverse(4);
    // 4
    // 3
    // 2
    // 1

}