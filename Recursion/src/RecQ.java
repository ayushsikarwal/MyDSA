import java.util.Arrays;

public class RecQ {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        triangleSum(arr);
//        System.out.println(findMaxRec(arr,arr.length));
//        System.out.println(findMinRec(arr, arr.length));
    }
    public static void triangleSum(int[]arr){
        if(arr.length<1){
            return ;
        }
        int val = arr.length-1;
        int[]temp = new int[val];
        for (int i = 0; i < val ; i++) {
            temp[i] = arr[i] + arr[i+1];
        }
        System.out.println(Arrays.toString(temp));
        if(temp.length==1){
            return;
        }
        triangleSum(temp);
    }
    public static int max(int[]arr){
        //max using recursion
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                //swap
                int temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
//        max(arr);
        return arr[arr.length-1];
    }

    public static int findMaxRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.max(A[n-1], findMaxRec(A, n-1));
    }

    public static int findMinRec(int A[], int n)
    {
        if(n == 1) {
            return A[0];
        }
        return Math.min(A[n-1], findMinRec(A, n-1));
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, e);
        } else {
            return binarySearch(nums, target, s, mid - 1);
        }
        // return 0;
    } 
}
