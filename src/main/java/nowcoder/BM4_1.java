package nowcoder;

public class BM4_1 {
    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        // write code here
        ListNode head = new ListNode(0);
        ListNode ans = head;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val < pHead2.val) {
                ans.next = pHead1;
                pHead1 = pHead1.next;
            } else {
                ans.next = pHead2;
                pHead2 = pHead2.next;
            }
            ans = ans.next;
        }
        if (pHead1 != null) {
            ans.next = pHead1;
        }
        if (pHead2 != null) {
            ans.next = pHead2;
        }
        return head.next;
    }
}