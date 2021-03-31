import java.util.HashMap;
import java.util.HashSet;

public class LC974 {
    public int subarraysDivByK(int[] A, int K) {
        //暴力解法
        int n=A.length;
        int num=0;
        for(int i=0;i<n;i++){
            int low=i,high=i,sum=0;
            while(high<n){
                sum+=A[high];
                if(sum%K==0)num++;
                high++;
            }
        }
        return num;
    }
    public int subarraysDivByK2(int[]A,int K){
        int n=A.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(sum<0)map.put(sum%K,map.getOrDefault(sum%K,0)+1);
            else map.put(sum%K,map.getOrDefault(sum%K,0)+1);
        }
        int num=map.containsKey(0)?map.get(0):0;
        for(int key:map.keySet()){
            if(map.get(key)>1)num+=(map.get(key)*(map.get(key)-1))/2;
        }
        return num;
    }
    public static void main(String[]args){
        LC974 s=new LC974();
        System.out.println(s.subarraysDivByK2(new int[]{4455,45,45,45,45,45,45,4,5,45,1},5));
    }
}
