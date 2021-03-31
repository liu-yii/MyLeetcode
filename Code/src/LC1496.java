import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LC1496 {
    //哈希表
    public boolean isPathCrossing(String path) {
        Set<Integer> vis = new HashSet<Integer>();
        int x = 0, y = 0;
        vis.add(x*20001+y);
        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hashValue = x*20001+y;
            if (!vis.add(hashValue)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[]args){
        LC1496 s=new LC1496();
        System.out.println(s.isPathCrossing("SSSWNNWNENNNWWNNNENNNNNWNNNNWNWSWWWSWWWNWSWSW"));
    }
}
