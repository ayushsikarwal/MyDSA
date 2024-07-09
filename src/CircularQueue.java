public class CircularQueue {
    public int[]data;

    public int DEFAULT_SIZE=5;

    int end = 0;
    int front = 0;

    int size =0;
    public CircularQueue(){
        this.data= new int[this.DEFAULT_SIZE];
    }
    public CircularQueue(int size){
        this.data= new int[size];

    }

    public boolean isFull(){
        return size >= data.length ;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            // If the queue is empty, update both front and end indices
            front = 0;
            end = 0;
        }

        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }


    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }

        int remove = data[front];
        front=(front+1)% data.length;

        // shifting all the other elements

//        for (int i = 1; i <=end ; i++) {
//            data[i-1]=data[i];
//        }
        size--;

        return remove;
    }

    public int printFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[front++];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;
        do {
            System.out.print(data[i] + "-->");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

}
