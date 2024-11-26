package nowcoder.BM;

public class BM4 {
    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val < pHead2.val) {
                cur.next = pHead1;
                cur = cur.next;
                pHead1 = pHead1.next;
            } else {
                cur.next = pHead2;
                cur = cur.next;
                pHead2 = pHead2.next;
            }
        }
        if (pHead1 != null) {
            cur.next = pHead1;
        } else {
            cur.next = pHead2;
        }
        return ans.next;
    }
}