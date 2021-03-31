package traceback;
import java.util.*;

public class LC47 {
    List<List<Integer>> res=new LinkedList<>();
    public void traceback(int[]nums,LinkedList<Integer>trace,boolean[]visited,int index){
        if(index==nums.length){
            res.add(new LinkedList<>(trace));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]||(i>0&&nums[i-1]==nums[i]&&!visited[i-1]))continue;
            visited[i]=true;trace.add(nums[i]);
            traceback(nums, trace, visited, index+1);
            visited[i]=false;trace.remove(index);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> trace=new LinkedList<>();
        boolean[]visited=new boolean[nums.length];
        Arrays.sort(nums);
        traceback(nums,trace,visited,0);
        return res;
    }
    public static void main(String[]args){
        LC47 s=new LC47();
        System.out.println(s.permuteUnique(new int[]{1,2,3,2}));
    }
}
