import java.util.Arrays;

public class SearchTwoDinArray {
    public static void main(String[] args) {
        int[][] arr= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr,89)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;
        while ( r< matrix.length &&  c>=0) {
            if (target < matrix[r][c] ){
                c--;
                continue;
            }
            if (target > matrix[r][c] ){
                r++;
               continue;
            }
            if (target == matrix[r][c] ){
                return new int[]{r, c};
            }

        }
        return new int[]{-1,-1};
    }
}




