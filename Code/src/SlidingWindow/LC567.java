package SlidingWindow;

import java.util.HashMap;

public class LC567 {
    public boolean checkInclusion(String s1, String s2) {
        int left=0,right=0,length=Integer.MAX_VALUE;
        int l=s1.length();
        int valid=0;
        HashMap<Character,Integer>window=new HashMap<>();
        HashMap<Character,Integer>need=new HashMap<>();
        for(int i=0;i<s1.length();i++)need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        while(right<s2.length()){
            char c=s2.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c)==need.get(c))valid++;
            }

            while(valid==need.size()){
                length=Math.min(length,right-left);
                char d=s2.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d)==need.get(d))valid--;
                    window.put(d,window.get(d)-1);
                }

            }
        }
        if(length==l)return true;
        else return false;
    }
    public static void main(String[]args){
        LC567 s=new LC567();
        System.out.println(s.checkInclusion("ba", "bbbba"));
    }
}
