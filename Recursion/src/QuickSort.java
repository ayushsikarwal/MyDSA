import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {13,234,21,43,5,23};
        sort(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr, int high, int low){
        if(low==high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;

        while(s<=e){
            while(arr[s]<arr[mid]){
                s++;
            }
            while(arr[e]>arr[mid]){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // now pivot at its correct position
        // time to sort other two halves
        sort(arr,e,low);
        sort(arr,high,s);
    }
}
