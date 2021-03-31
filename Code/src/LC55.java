public class LC55 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==0)return true;
        int max_length=nums.length-1;
        for(int i=n-2;i>=0;i--){
            if(i+nums[i]>=max_length)max_length=i;
        }
        if(max_length==0)return true;
        else return false;
    }
    public static void main(String[]args){
        LC55 solution=new LC55();
        int[] nums={3,2,1,0,4};
        System.out.println(solution.canJump(nums));
    }
}
