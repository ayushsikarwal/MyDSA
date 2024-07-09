import java.util.Scanner;
import java.util.Arrays;



public class QuestionsOnBinary //
// {       //find first and last occurence index of a number
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,5,5,5,5,7,8};
//        Scanner sc = new Scanner(System.in);
//        int key = sc.nextInt();
//        System.out.println("The first and last index of key " + key + " is " + FirstOcc(arr, key) + " and " + LastOcc(arr, key) + " respectively.");
//    }
//
//    static int FirstOcc(int[] num, int key) {
//        int s=0, e = num.length-1;
//        int mid = s+(e-s)/2;
//        int ans =-1;
//        while (s<=e){
//            if (num[mid]==key){
//                ans=mid;
//                e=mid-1;
//
//            }
//            if(num[mid]<key){
//                s=mid+1;
//            }
//            if(num[mid]>key){
//                e=mid-1;
//            }
//            mid= s+(e-s)/2;
//        }
//        return ans;
//    }
//    static int LastOcc(int[] num, int key) {
//        int s=0, e=num.length-1;
//        int mid = s+(e-s)/2;
//        int ans =-1;
//        while (s<=e){
//            if (num[mid]==key){
//                ans=mid;
//                s=mid+1;
//
//            }
//            if(num[mid]<key){
//                s=mid+1;
//            }
//            if(num[mid]>key){
//                e=mid-1;
//            }
//            mid= s+(e-s)/2;
//        }
//        return ans;
//    }
//}
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2,1,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("the highest number from the given array is "+HighestNumber(arr));
    }
    static int HighestNumber(int[]num){
        int s=0,e= num.length-1;
        int mid=s+(e-s)/2;
        int highest;
        while(s<=e){
            if(num[mid]>num[mid-1] && num[mid]> num[mid+1]){
                highest = num[mid];
                return highest;
            }
            if(num[mid]>num[mid-1] && num[mid]< num[mid+1]){
                s= mid+1;
            }
            if (num[mid] < num[mid - 1] && num[mid] > num[mid + 1]) {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return 0;
    }
}