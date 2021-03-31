package DFS;

import java.util.LinkedList;
import java.util.List;

public class LC40 {
    List<List<Integer>> res=new LinkedList<>();

    public void traceback(int[]candidates,int target,List<Integer>path,int index,boolean[]vis){
        if(index>=candidates.length)return;
        if(target==0){
            res.add(new LinkedList<>(path));
            return;
        }
        traceback(candidates,target,path,index+1,vis);
        if(target-candidates[index]>=0&&vis[index]==false){
            path.add(candidates[index]);
            vis[index]=true;
            traceback(candidates,target-candidates[index],path,index,vis);
            vis[index]=false;
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> path=new LinkedList<>();
        boolean[] vis=new boolean[candidates.length];
        traceback(candidates,target,path,0,vis);
        return res;
    }
    public static void main(String[]args){
        LC40 s=new LC40();
        int[] candidates={10,1,2,7,6,1,5};
        System.out.println(s.combinationSum2(candidates,8));
    }
}
