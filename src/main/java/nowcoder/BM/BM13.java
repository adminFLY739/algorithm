package nowcoder.BM;

public class BM13 extends BM1 {
    public boolean isPail(ListNode head) {
        ListNode newHead = ReverseList(cloneList(head));
        while (head != null && newHead != null) {
            if (head.val != newHead.val) {
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    public ListNode cloneList(ListNode head) {
        ListNode newHead = new ListNode(head.val);
        ListNode ans = newHead;
        while (head.next != null) {
            head = head.next;
            newHead.next = new ListNode(head.val);
            newHead = newHead.next;
        }
        return ans;
    }
}
