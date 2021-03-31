import java.lang.reflect.Array;
import java.util.Stack;


//数组下一个最大的数
public class LC503 {
    public int[] MynextGreaterElements(int[] nums) {
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length+i;j++){
                int cur=j;
                if(j>=nums.length){
                    cur=j-nums.length;
                }
                if(nums[i]<nums[cur]){
                    res[i]=nums[cur];
                    break;
                }
                res[i]=-1;
            }
        }
        return res;
    }
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int j=0;j<n;j++){
            res[j]=-1;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            //将单调栈中所有小于nums[i%n]的下标出栈
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i%n]){
                res[stack.pop()]=nums[i%n];
            }

            stack.push(i%n);
        }
        return res;
    }
    public static void main(String[] args){
        LC503 solution=new LC503();
        int[]nums={1,2,1};
        int[]res=solution.nextGreaterElements(nums);
        for(int r:res){
            System.out.println(r);
        }
    }
}
