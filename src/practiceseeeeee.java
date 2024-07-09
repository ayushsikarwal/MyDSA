import java.util.Arrays;

public class practiceseeeeee {
    public static void main(String[] args) {
        int [][]arr={{0,1,1},{1,0,1},{0,0,1}};
        System.out.println(Arrays.deepToString(onesMinusZeros(arr)));

    }
    static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        System.out.println(n);
        int [][]diff= new int[m][n];
        for(int i =0; i<m;i++){
            for(int j =0; j<n;j++){
                int one =0;
                if(grid[i][j]==1){
                    one++;
                }
                if(grid[j][i]==1){
                    one++;
                }
                diff[i][j]=one -(m+n-one);
            }
        }
        return diff;
    }
}
