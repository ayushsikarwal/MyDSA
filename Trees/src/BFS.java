import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
//        Node root;

        public List<Integer> levelOrder(Node root){
            List<Integer> result = new ArrayList<>();
            if(root==null || (root.left==null && root.right==null)){
                return result;
            }
            Queue<Node> q = new LinkedList<>();

            return helper(root,q,result);

        }
        private List<Integer> helper(Node node, Queue<Node> q, List<Integer>result){

            q.offer(node);

            while(!q.isEmpty()){
                Node curr = q.peek();
                result.add(q.poll().data);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.left!=null){
                    q.add(curr.right);
                }

            }
            return result;
        }
    }
}
