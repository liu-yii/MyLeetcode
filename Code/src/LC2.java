public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2;
        ListNode res=new ListNode(0),cur=res;
        while(p1!=null||p2!=null){
            cur.next=cur.next==null?new ListNode(0):cur.next;
            cur=cur.next;
            int n1=p1==null?0:p1.val;
            int n2=p2==null?0:p2.val;
            int ans=n1+n2;
            if(cur.val+ans<10){
                cur.val=(cur.val+ans)%10;
            }else{
                if(cur.next==null)cur.next=new ListNode((cur.val+ans)/10);
                cur.val=(cur.val+ans)%10;

            }
            p1=p1==null?p1:p1.next;p2=p2==null?p2:p2.next;
        }

        return res.next;
    }
    public static void main(String[]args){
        LC2 s=new LC2();
        int[]nums=new int[]{1,2,3,4,5};
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(9);
        l2.next=new ListNode(9);
        ListNode res=s.addTwoNumbers(l1,l2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}
