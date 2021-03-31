public class LC82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next == null) return head;
        ListNode cur = head, next = head.next, pre = new ListNode(0);
        while (next != null) {
            if (cur.val == next.val) {
                while (next != null && cur.val == next.val) {
                    if (cur == head) head = next;
                    else pre.next = next;
                    cur = next;
                    next = next.next;
                }
                if (cur == head) head = next;
                else pre.next = next;
                cur = next;
                next = (next==null)?null:next.next;
            } else {
                pre = cur;
                cur = cur.next;
                next = next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LC82 s = new LC82();
        int[] nodes = new int[]{3, 3};
        ListNode head = new ListNode(nodes[0]), cur = head;
        for (int i = 1; i < nodes.length; i++) {
            cur.next = new ListNode(nodes[i]);
            cur = cur.next;
        }
        ListNode res = s.deleteDuplicates(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
