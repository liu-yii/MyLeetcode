package DP;

import DFS.LC79;

public class LC357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[]dp=new int[n+1];
        if(n==0)return 1;
        if(n==1)return 10;
        dp[0]=1;
        dp[1]=10;
        for(int i=2;i<n+1;i++){
            if(10-i+1>0)
                dp[i]=dp[i-1]+(dp[i-1]-dp[i-2])*(10-i+1);
            else dp[i]=dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[]args){
        LC357 s=new LC357();
        System.out.println(s.countNumbersWithUniqueDigits(3));
    }
}
