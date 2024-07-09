//import java.util.Scanner;
//import java.util.Arrays;
//
//public class sorting {
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    public static void main(String[] args){
//        int [] num = {12,23,43,1,13,67};
//        for(int i =0; i< num.length-1;i++){
//            int minIndex = i;
//            for(int j=i;j<num.length;j++){
//                if (num[j]<num[minIndex]){
//                    minIndex=j;
//                }
//                swap(num, i, minIndex);
//            }
//        }
//    }
//}

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {12, 13, 2, 42, 15};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

