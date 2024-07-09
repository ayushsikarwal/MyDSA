import java.util.Scanner;

public class TWOdArrays {
    public static void main(String[] args){
        int [][] arr = new int [3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements you want in matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr [i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr [i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the element about which you wanna know whether the element exist or not in the matrix : ");
        int element = sc.nextInt();;
        if(isPresent(arr,element,3,4)){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
        // row wise sum
        sum(arr,3,4);
        colSum(arr, 3, 4);
        System.out.println("row whose elements' sum is larget is "+largestRow(arr, 3, 4));
        sinform(arr,3,4);
    }
    //find whether the input element exist or not in matrix
    private static boolean isPresent(int [][]arr, int target, int row, int col){
        for(int a = 0; a <3; a++){
            for(int b = 0; b <4; b++){
                if( arr[a][b] == target){
                    return true;
                }
            }
        }
        return false;
    }
    private static void sum(int[][]arr, int row, int col){
        for(int i=0; i<3; i++) {
            int sum =0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            int k = i+1;
            System.out.println("sum of row " + k + " = " + sum);
        }
    }
    private static void colSum(int[][]arr, int row, int col){
        for(int i=0; i<4; i++) {
            int sum =0;
            for (int j = 0; j < 3; j++) {
                sum += arr[j][i];
            }
            int k = i+1;
            System.out.println("sum of column " + k + " = " + sum);
        }
    }
    private static int largestRow(int[][]arr, int row, int col){
        int[] sumofrow = new int[row];
        for(int i=0; i<row; i++) {
            int sum =0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            int k = i+1;
            System.out.println("sum of row " + k + " = " + sum);
            sumofrow[i]=sum;
        }
        int max=0;
        int ans=0;
        //max=sumofrow[0];
        for(int k=0; k< sumofrow.length; k++){
            //max=sumofrow[0];
            if(sumofrow[k]>max){
                max=sumofrow[k];
                ans=k;
            }
        }
        return ans+1;
    }
    //printing array in sine wave form
    private static void sinform(int[][]arr, int row, int col) {
        for (int k = 0; k < col; k++) {
            if (k % 2 == 0) {
                //top to bottom
                for (int l = 0; l < row; l++) {
                    System.out.print(arr[l][k] + " ");
                }
                //System.out.println();
            }
            else {
                for (int m = row-1; m >= 0; m--) {
                    System.out.print(arr[m][k] + " ");
                }
               // System.out.println();
            }

        }
    }

}
