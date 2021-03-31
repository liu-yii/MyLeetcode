package DP;//动态规划

public class LC91 {
    public int numDecodings(String s) {
        int n=s.length();
        int[][] dp=new int[n][2];
        if(s.charAt(0)=='0')return 0;
        dp[0][0]=1;dp[0][1]=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0'){
                dp[i][0]=0;
                if(s.charAt(i-1)>'2'){
                    dp[i][1]=0;
                }else dp[i][1]=dp[i-1][0];

            }
            else if(Integer.parseInt(s.substring(i-1,i+1))>26){
                dp[i][0]=dp[i-1][0]+dp[i-1][1];
                dp[i][1]=0;
            }
            else {
                dp[i][0]=dp[i-1][0]+dp[i-1][1];
                dp[i][1]=dp[i-1][0];
            }
        }
        return dp[n-1][0]+dp[n-1][1];
    }
    public static void main(String[]args){
        LC91 solution=new LC91();
        System.out.println(solution.numDecodings("230"));
    }
}
