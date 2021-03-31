package DP;

public class LC343 {
    public int integerBreak(int n) {
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n==2)return 1;
        if(n==3)return 2;
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<n+1;i++){
            int max=0;
            for(int j=2;j<=i/2;j++){
                if(dp[j]>j)
                    max=Math.max(Math.max(max,dp[j]*dp[i-j]),dp[j]*(i-j));
                else max=Math.max(Math.max(max,j*dp[i-j]),j*(i-j));
                dp[i]=max;
            }

        }
        return dp[n];
    }
    public static void main(String[]args){
        LC343 s=new LC343();
        System.out.println(s.integerBreak(10));
    }
}
