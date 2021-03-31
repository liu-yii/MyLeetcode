public class LC42 {
    public int trap(int[] height) {
        int sum=0;

        for(int i=0;i<height.length;i++){
            int left_max=0,right_max=height.length-1;
            for(int left=0;left<i;left++){
                if(height[left]>height[left_max])left_max=left;
            }
            for(int right=height.length-1;right>i;right--){
                if(height[right]>height[right_max])right_max=right;
            }
            sum+=Math.max(Math.min(height[left_max],height[right_max]),height[i])-height[i];
        }
        return sum;
    }
    public static void main(String[]args){
        LC42 sol=new LC42();
        int[]height={4,2,0,3};
        System.out.println(sol.trap(height));
    }
}
