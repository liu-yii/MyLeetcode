package DP;//动态规划

public class LC70 {
    public int climbStairs(int n) {
        int[]dp=new int[n];
        if(n==1||n==2)return n;
        dp[0]=1;dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    public static void main(String[]args){
        LC70 solution=new LC70();
        System.out.println(solution.climbStairs(7));
    }
}
