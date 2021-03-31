import java.util.LinkedList;

public class LC1414 {
    public int findMinFibonacciNumbers(int k) {
        int a=1,b=1;
        LinkedList<Integer> fib=new LinkedList<>();
        fib.add(a);
        fib.add(b);
        while(a+b<=k){
            fib.add(a+b);
            int c=a+b;
            a=b;
            b=c;
        }
        int ans=0;
        for(int i=fib.size()-1;i>=0;i--){
            if(k>=fib.get(i)){
                k-=fib.get(i);
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        LC1414 solution =new LC1414();
        System.out.println(solution.findMinFibonacciNumbers(6));
    }
}
