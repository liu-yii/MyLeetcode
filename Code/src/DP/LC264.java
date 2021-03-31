package DP;

import java.util.HashSet;

public class LC264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (!set.contains(dp[j] * 2)&&dp[j] * 2 < min) min = dp[j] * 2;
                if (!set.contains(dp[j] * 3)&&dp[j] * 3 < min) min = dp[j] * 3;
                if (!set.contains(dp[j] * 5)&&dp[j] * 5 < min) min = dp[j] * 5;
            }
            dp[i] = min;
            set.add(dp[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        LC264 solution = new LC264();
        char[][] nums = {{'0', '1'}};
        System.out.println(solution.nthUglyNumber(10));
    }
}
