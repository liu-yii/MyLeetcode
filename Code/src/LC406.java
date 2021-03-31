import java.util.Arrays;
import java.util.Comparator;

public class LC406 {
    public int[][] reconstructQueue(int[][] people) {
        int[][] res=new int[people.length][2];
        for(int[] n:res){
            Arrays.fill(n,-1);
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];//按照升序排列，从小到大
                return o1[0] - o2[0];
            }
        });
        for(int i=0;i<people.length;i++){
            int m=0;
            for(int j=0;j<=people[i][1]+m;j++){
                if(res[j][0]<people[i][0]&&res[j][0]>=0)
                    m++;
            }
            res[people[i][1]+m]=people[i];
        }
        return res;
    }
    public static void main(String[]args){
        LC406 solution = new LC406();
        int[][]people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][]res=solution.reconstructQueue(people);
        for(int[] re:res){
            for(int r:re){
                System.out.print(r);
            }
            System.out.print("\n");
        }
    }
}
