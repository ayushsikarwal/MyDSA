import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args){
        int[]arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
//        int k = arr.length;
//        System.out.println(k);
    }
    static void insertion(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]>arr[j-1]){
                   break;
                }
                else{
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
