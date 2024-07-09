import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args){
        int[] arr = {3,1,2,6,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int k = arr.length-i-1;
           int max =  maxIndex(arr,k);


            //now swap max with the last element of the new string
            int temp = arr[k];
            arr[k] = arr[max];
            arr[max] = temp;

        }
    }
    static int maxIndex(int[]arr,int last){
        int max = 0;
        for (int j = 0; j <= last ; j++) {
           if(arr[j]>arr[max]){
                max=j;
            }
        }
        return max;
    }


}
