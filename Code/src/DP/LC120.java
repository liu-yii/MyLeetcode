package DP;

import java.util.Arrays;
import java.util.List;

//动态规划入门题
public class LC120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        if(n==1)return triangle.get(0).get(0);
        int[][]dp=new int[n][m];
        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++){
            for(int j=0;j<triangle.get(i).size();j++){
                if(j>0&&j<triangle.get(i-1).size())
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
                else if(j==0) dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                else dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
            }
        }
        Arrays.sort(dp[n-1]);
        return dp[n-1][0];
    }
    public static void main(String[]args){
        LC120 solution=new LC120();

    }
}
