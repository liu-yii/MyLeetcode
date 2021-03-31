import java.util.*;
public class LC139 {
    public boolean in(String s,List<String> wordDict){
        for(int i=0;i<wordDict.size();i++){
            if(wordDict.get(i).equals(s))return true;
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        String leave="";
        int start=0;
        for(int i=1;i<=s.length();i++){
            String tmp=s.substring(start,i);
            if(in(tmp,wordDict)){
                leave="";
                start=i;
            }
            else leave=tmp;
        }
        if(leave.equals(""))return true;
        else return false;
    }
    public static void main(String[]args){
        LC139 s=new LC139();
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("catas");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("dog");
        System.out.println(s.wordBreak("catassanddog",wordDict));
    }
}
