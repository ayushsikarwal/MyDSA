import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fac(a));
        int b = sc.nextInt();
        System.out.println(fibo(b));
        int []arr= {1,2,4,5,6,12,16,19};
        int s = 0;
        int e = arr.length-1;
        int target = 19;
        System.out.println(binarySearch(arr, target, s, e));
    }
    static int fac(int n ){
        int fact = n ;
        if (n==0){
            return 1;
        }
        fact = fact*fac(n-1);
        return fact;
    }
    static int fibo(int k ){
       if(k==1){
           return 0;
       }
       if(k==2){
           return 1;
       }
       int sum;
       sum = fibo(k-1)+fibo(k-2);
       return sum;
    }
    static int binarySearch(int[]arr, int target, int s, int e){
        int mid = s + (e-s)/2 ;
        if (s>e){
            return -1;
        }
        if(arr[mid]==target){
            return mid+1;
        }
        if(arr[mid] > target){
            return binarySearch(arr, target,s , mid-1);
        }
        if(arr[mid ]< target){
           return binarySearch(arr, target,mid+1 , e);
        }
        return 0;
    }
}
