package SlidingWindow;

import java.util.*;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> window=new HashMap<>();
        int left=0,right=0;
        int res=0;
        while(right<n){
            char c=s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);
            //System.out.println(String.format("window:[%d,%d)",left,right));
            while(window.get(c)>1){
                char d=s.charAt(left);
                left++;
                window.put(d,window.get(d)-1);
            }
            //System.out.println(String.format("window:[%d,%d)",left,right));
            res=Math.max(res,right-left);
        }
        return res;

    }
    public static void main(String[]args){
        LC3 s=new LC3();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
