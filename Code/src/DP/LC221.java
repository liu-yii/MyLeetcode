package DP;

public class LC221 {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=0;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            if(matrix[i][0]=='0')dp[i][0]=0;
            else {
                dp[i][0]=1;
                max=1;
            }
        }
        for(int j=0;j<n;j++){
            if(matrix[0][j]=='0')dp[0][j]=0;
            else {
                dp[0][j]=1;
                max=1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]=='0')dp[i][j]=0;
                else dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                if(dp[i][j]>max)max=dp[i][j];
            }
        }
        return max*max;
    }
    public static void main(String[]args){
        LC221 solution=new LC221();
        char[][]nums = {{'0','1'}};
        System.out.println(solution.maximalSquare(nums));
    }
}
