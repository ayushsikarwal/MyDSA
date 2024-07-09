import java.util.Arrays;

public class MaximumHappinessSum {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int sum = 0;
        int p = 0;
        int l = happiness.length;
        for (int i = 0; i < k; i++) {
            sum += happiness[l - i - 1];
            if (happiness[l - i - 1] - p >= 0) {
                sum -= p;
                p++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] happiness = {1, 3, 2, 4};
        int k = 2;
        System.out.println(maximumHappinessSum(happiness, k));  // Output should be 7
    }
}
