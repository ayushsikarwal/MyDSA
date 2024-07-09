import java.util.LinkedList;
import java.util.Queue;

public class Questions {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            this.data=val;
        }
    }
    public static void main(String[] args) {

    }
    public int nextSuccessor(Node root, Node target){
        if(root==null){
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.peek();
            q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr==target){
                break;
            }
        }
        return q.poll().data;
    }
}
