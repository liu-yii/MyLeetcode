package traceback;
import java.util.*;

public class LC46 {
    List<List<Integer>>res=new ArrayList<>();
    public void traceback(int[]nums,List<Integer>trace){
        if(trace.size()==nums.length){
            res.add(new ArrayList<>(trace));
            return;
        }
        for(int num:nums){
            if(!trace.contains(num))
                trace.add(num);
            else continue;
            traceback(nums,trace);
            trace.remove(trace.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> trace=new ArrayList<>();
        traceback(nums,trace);
        return res;
    }
    public static void main(String[]args){
        LC46 s=new LC46();
        System.out.println(s.permute(new int[]{1,2,3}));
    }
}
