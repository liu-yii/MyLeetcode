import java.util.*;

//Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }
 }

public class LC817 {
     public int dfs(ListNode head,int[]G,int num){
         if(head==null)return 0;
         if(Arrays.asList(G).contains(head.val))dfs(head.next,G,num);
         else return dfs(head.next,G,num+1);
         return 0;
     }
     public boolean in(int[]G,int num){
         for(int g:G){
             if(g==num)return true;
         }
         return false;
     }
    public int numComponents(ListNode head, int[] G) {
        ListNode pre=head,cur=head.next;
        int num=0;
        if(in(G,head.val))num++;
        while(cur!=null){
            if(in(G,cur.val)&&!in(G,pre.val))num++;
            cur=cur.next;
            pre=pre.next;
        }
        return num;
    }
    public static void main(String[]args){
        LC817 s=new LC817();
        ListNode head=new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        System.out.println(s.numComponents(head,new int[]{0,1,3}));
    }
}
