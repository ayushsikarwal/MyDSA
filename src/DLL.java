import java.util.*;
import java.lang.*;
public class DLL {
    Node head;
    public void addFirst(int val){
        Node temp = new Node(val);
        if(head == null){
            head=temp;
            temp.prev=null;
        }else {
            temp.next=head;
            temp.prev=null;
            head.prev=temp;
            head=temp;
        }
    }
    public void printDll(){
        Node temp= head;
        Node last = null;
        if(head==null){
            System.out.println("null");
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            last= temp;
            temp = temp.next;
        }
        System.out.println("END");

        while (last!=null){
            System.out.print(last.data+"-->");
           last= last.prev;
        }
        System.out.println("END");
    }
    public void isertionDLL(int val, int place){
        Node temp= new Node(val);
        Node temp1= new Node();
        temp1=head;
        Node temp2= new Node();
        for (int i = 0; i < place -2; i++) {
           temp1=temp1.next;
           temp2=temp2.next.next;
        }
        temp1.next=temp;
        temp.next=temp2;
        temp2.prev=temp;
        temp.prev=temp1;

    }

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int value){
            this.data= value;
        }
        public Node(){

        }
    }
}
