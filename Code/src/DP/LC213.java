package DP;

import java.util.Arrays;

public class LC213 {
    public int rob(int[] nums){
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        return Math.max(myrob(Arrays.copyOfRange(nums,1,n)),myrob(Arrays.copyOfRange(nums,0,n-1)));
    }
    public int myrob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]dp=new int[n];
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    public static void main(String[]args){
        LC213 solution=new LC213();
        int[]nums = {1,0,1,10};
        System.out.println(solution.rob(nums));
    }
}
