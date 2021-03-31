public class LC647 {
    public int countSubstrings(String s) {
        int n=s.length();
        int num=0;
        for(int i=0;i<n;i++){
            num+=extend(s,i,i)+extend(s,i,i+1);
        }
        return num;
    }
    public int extend(String s,int start,int end){
        int num=0;
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            num++;
        }
        return num;
    }
    public static void main(String[]args){
        LC647 s=new LC647();
        System.out.println(s.countSubstrings("aaa"));
    }
}
