import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
    int [] arr = {1,4,7,8,9,2,7,534,232,536};
    bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped=false;
        //run the steps n-1 times
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j < arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    swapped=true;

                } else{
                    continue;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
