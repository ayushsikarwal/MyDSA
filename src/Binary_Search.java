import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        System.out.print("How many integers you want in array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("enter integer which you want to find out");
        int key = sc.nextInt();
        System.out.println(key + " Found at Index: " + search(arr, key));

    }
    static int search(int[]num, int key){
        int start = 0;
        int end = num.length-1;
        int mid = (start+end)/2;
        while(start <= end) {
            if (num[mid] < key) {
                start = mid + 1;
                mid = (start+end)/2;
            }
            if (num[mid] > key) {
                end = mid - 1;
                mid = (start+end)/2;
            }
            if(num[mid]==key) {
                return mid;
            }
        }
        return -1;
    }
}