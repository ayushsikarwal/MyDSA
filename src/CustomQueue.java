public class CustomQueue {
    public int[]data;

    public int DEFAULT_SIZE=5;

    int end = -1;
    public CustomQueue(){
        this.data=new int[this.DEFAULT_SIZE];
    }
    public CustomQueue(int size){
        this.data= new int[size];

    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full!!");
        }
        end++;
        data[end]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is full!!");
        }

        int remove = data[0];

        // shifting all the other elements

        for (int i = 1; i <=end ; i++) {
            data[i-1]=data[i];
        }
        end--;

        return remove;
    }

    public int printFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
       return data[0];
    }

    public void display(){
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i]+"-->");
        }
        System.out.println("END");
    }

    public boolean isFull(){
        return end >= data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }
}
