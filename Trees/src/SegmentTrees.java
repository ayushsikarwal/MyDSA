public class SegmentTrees {
    public class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;
        public Node(){
        }
        public Node(int startInteval, int endInterval){
            this.start=startInteval;
            this.end=endInterval;
        }
    }
    Node root;
    public SegmentTrees(int[]arr){
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start==end){
            Node leaf = new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start+end)/2 ;
        node.left= this.constructTree(arr,start,mid);
        node.right= this.constructTree(arr,mid+1,end);

        node.data= node.left.data+node.right.data;

        return node;
    }
    public int query(int start, int end){
        return helper(this.root,start,end);
    }

    private static int helper(Node node, int start, int end) {
        if(start<=node.start && end>=node.end){
                return node.data;
        }else if(start<node.start || end> node.end){
            return 0;
        }else{
            int leftAns= helper(node.left,start,end);
            int rightAns= helper(node.right,start,end);

            return leftAns+rightAns;
        }
    }
    public void update(int index, int value){
         this.root.data=updateHelper(this.root, index, value);
    }

    private int updateHelper(Node node, int index, int value) {
        if(index>=node.start && index<=node.end){
            if(index== node.start && index== node.end){
                node.data=value;
                return node.data;
            }

            int leftAns= updateHelper(node.left,index,value);
            int rightAns= updateHelper(node.right,index,value);

            node.data=leftAns+rightAns;

            return node.data;
        }

        return node.data;
    }

}
