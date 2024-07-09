import java.util.LinkedList;

public class LLKunalKushwaha {
    class Node{
        int data;
        Node next;

        public Node(int value){
            this.data= value;
        }
        public Node(){

        }
    }

    Node head;
    Node tail;
    int size;


    public LLKunalKushwaha(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;

        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void add(int val){
        Node temp = new Node(val);
        if(head!=null){
            temp.next=head;
            head= temp;
//            System.out.print(temp.data +"-->");
        }else{
            head=temp;
//            System.out.print(temp.data +"-->");
        }
    }
public void insertElement(int place,int val){
    Node temp1 = new Node();
    temp1=head;
    Node temp2 = new Node();
    Node toBeAdded= new Node(val);
    for (int i = 0; i < place-2; i++) {
//        if(i==place-2){
//            temp1.next=toBeAdded;
//            toBeAdded.next=temp2;
//        }
        temp1=temp1.next;
        temp2=temp1.next.next;
    }
    temp1.next=toBeAdded;
    toBeAdded.next=temp2;

}
    public void remove(int val){
       Node temp1 = new Node();
//       Node temp2 = new Node();
//        Node temp = new Node();
       Node temp=head;
       while(temp.data!=val){
           if(temp.next.data==val){
               temp1=temp.next.next;
               temp.next=temp1;
                return;
           }
           temp=temp.next;
       }
    }
    public void insertionLast(int val){
        Node temp = new Node(val);
        if (tail==null) {
            insertFirst(val);
            return;
        }
       else {
            tail.next=temp;
            tail=temp;
        }

    }
    public void printValues(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.println("END");
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
