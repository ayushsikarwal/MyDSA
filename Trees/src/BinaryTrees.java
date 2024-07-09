import java.util.*;

public class BinaryTrees {

    public BinaryTrees(){

    }
    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public Node root;

    // insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the root node");
        int value = sc.nextInt();
//        root.value= value;
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter value in the left of the root"+ node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value left of node "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter value in the right of the root"+ node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value right of node "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, " ");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        display(node.left, indent);
        display(node.right, indent);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }

}
