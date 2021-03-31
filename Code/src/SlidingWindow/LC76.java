package SlidingWindow;
import java.util.*;

public class LC76 {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        int left=0,right=0,valid=0;
        int start=0,len=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++)need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c)==need.get(c))
                    valid++;
            }
            System.out.println(String.format("window:[%d,%d)",left,right));
            while(valid==need.size()){
                if(right-left<len){
                    len=right-left;
                    start=left;
                }
                char d=s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d)==need.get(d))
                        valid--;
                    window.put(d,window.get(d)-1);

                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
    public static void main(String[]args){
        LC76 s=new LC76();

    }
}
