public class LC1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][]dp=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n1][n2];
    }
    //斐波那契数列动态规划解法
    public int fib(int n) {
        int[] dp=new int[n];
        if(n==0||n==1)return n;
        dp[0]=1;dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    public static void main(String[]args){
        LC1143 solution=new LC1143();
        System.out.println(solution.longestCommonSubsequence("abcd","acder"));
        System.out.println(solution.fib(44));
    }
}
