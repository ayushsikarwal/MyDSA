import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("fibo number : ");
        int n = sc.nextInt();
        int[]dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n, dp));
        System.out.println(fiboSpaceOpti(n));
    }
    private static int fibo(int n, int[]dp){
        if(n<=1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]= fibo(n-1,dp)+ fibo(n-2, dp);

        return dp[n];
    }
    private static int fiboSpaceOpti(int n){
        int prev1=1;
        int prev2 =0;

        for (int i = 2; i <=n ; i++) {
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}