package nowcoder;

public class BM2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        for (int i = 0; i < m - 1; i++) {
            start = start.next;
        }
        ListNode cur = start.next;
        for (int i = 0; i < n - m; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = start.next;
            start.next = temp;
        }
        return dummy.next;
    }
}