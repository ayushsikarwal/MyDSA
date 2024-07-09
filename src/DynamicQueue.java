public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue (int size){
        super(size);
    }

    @Override
    public boolean insert(int item)  {
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length*2];
            //copy all items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[front+i];
            }
            front =0;
            end= data.length;
            data=temp;
        }
        // at this point we know that the array is not full
        //insert item

        return super.insert(item);
    }
}
