package DP;

//动态规划
public class LC152 {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max= Integer.MIN_VALUE,imax=1,imin=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                int tmp=imax;
                imax=imin;
                imin=tmp;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);

            max=Math.max(imax,max);
        }
        return max;
    }
    public static void main(String[]args){
        LC152 solution=new LC152();
        int[]nums = {2,0,-2,4};
        System.out.println(solution.maxProduct(nums));
    }
}
