import java.util.HashSet;
import java.util.Stack;

public class LC11 {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            if(height[left]<height[right]){
                max=Math.max(max,(right-left)*height[left]);
                left++;
            }
            else{
                max=Math.max(max,(right-left)*height[right]);
                right--;
            }
        }
        return max;
    }
    public static void main(String[]args){
        LC11 sol=new LC11();
        int[]height={1,2,3,4,4,7};
        System.out.println(sol.maxArea(height));
    }

}
