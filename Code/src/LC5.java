public class LC5 {
    public String longestPalindrome(String s) {
        int maxlen=0;
        String res="";
        for(int i=0;i<s.length();i++){
            String s1=extend(s,i,i);
            String s2=extend(s,i,i+1);
            String max=(s1.length()>s2.length())?s1:s2;
            if(max.length()>maxlen){
                maxlen=max.length();
                res=max;
            }
        }
        return res;
    }
    public String extend(String s,int start,int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
    public static void main(String[]args){
        LC5 s=new LC5();
        System.out.println(s.longestPalindrome("b"));
    }
}
