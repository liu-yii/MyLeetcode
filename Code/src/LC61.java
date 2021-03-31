public class LC61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        ListNode cur=head,pre=head;
        int size=0;
        ListNode end=head;
        while(end.next!=null){
            size++;
            end=end.next;
        }
        size++;
        for(int i=0;i<size-k%size;i++){
            pre=cur;
            cur=cur.next;
        }
        if(cur==null) return head;
        else {
            pre.next=null;
            end.next=head;
        }
        return cur;
    }
    public static void main(String[]args){
        LC61 s=new LC61();
        ListNode head=new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        ListNode res=s.rotateRight(head,2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}
