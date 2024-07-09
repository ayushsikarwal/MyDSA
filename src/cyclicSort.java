import java.lang.reflect.Array;
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==i+1){
                continue;
            } else{
                //swap arr[i] with arr[i]-1 index
                int k = arr[i]-1;
                int temp = arr[i];
                arr[i] =arr[k];
                arr[k] = temp;
                i--;
            }
        }
    }
}
