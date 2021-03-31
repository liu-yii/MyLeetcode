package SlidingWindow;

import java.util.HashMap;

public class LC395 {
    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer>window=new HashMap<>();
        int length=0;
        int left=0,right=0;
        while(right<s.length()){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            right++;
            System.out.println(String.format("window:[%d,%d)",left,right));
            while(window.get(c)>=k){
                length=Math.max(length,right-left);
                char d=s.charAt(left);
                window.put(d,window.get(d)-1);
                left++;
            }
        }
        return length;
    }
    public static void main(String[]args){
        LC395 s=new LC395();
        System.out.println(s.longestSubstring("ababbc",2));
    }
}
