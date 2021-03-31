import java.util.LinkedList;

public class LC43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))return "0";
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        for(int i=0;i<num1.length();i++){
            l1.add(num1.charAt(i)-'0');
        }
        for(int j=0;j<num2.length();j++){
            l2.add(num2.charAt(j)-'0');
        }
        int[] res=new int[num1.length()+num2.length()+2];
        for(int m=l1.size()-1;m>=0;m--){
            for(int n=l2.size()-1;n>=0;n--){
                res[res.length-(l1.size()-1-m+l2.size()-1-n)-1]+=(l1.get(m)*l2.get(n))%10;
                res[res.length-(l1.size()-1-m+l2.size()-1-n)-2]+=(l1.get(m)*l2.get(n))/10;
            }
            for(int p=res.length-1;p>0;p--){
                if(res[p]>=10){
                    res[p-1]=res[p-1]+res[p]/10;
                    res[p]=res[p]%10;
                }
            }
        }
        StringBuffer s=new StringBuffer();
        for(int num:res) {
            s.append((char) (num + '0'));
        }
        return s.toString().replaceFirst("^0*","");

    }
    public static void main(String[]args){
        LC43 sol=new LC43();
        System.out.println(sol.multiply("0","0"));
    }
}
