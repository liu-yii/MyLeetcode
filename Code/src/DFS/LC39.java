package DFS;

import java.util.LinkedList;
import java.util.List;

public class LC39 {
    List<List<Integer>> res=new LinkedList<>();
    public void traceback(int[]candidates,int target,List<Integer> path,int index){
        if(index==candidates.length){
            return;
        }
        if(target==0){
            res.add(new LinkedList<Integer>(path));
            return;
        }
        traceback(candidates,target,path,index+1);//？？？这句代码不理解意思
        if(target-candidates[index]>=0){
            path.add(candidates[index]);
            traceback(candidates,target-candidates[index],path,index);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> path=new LinkedList<>();
        traceback(candidates,target,path,0);
        return res;
    }
    public static void main(String[]args){
        LC39 s=new LC39();
        int[] candidates={2,3,6,7};
        System.out.println(s.combinationSum(candidates,7));
    }
}
