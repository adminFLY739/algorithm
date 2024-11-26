package nowcoder;

public class BM16 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                int temp = cur.val;
                while (cur != null && cur.val == temp) {
                    cur = cur.next;
                }
            } else {
                cur = cur.next;
            }
        }
        // todo
        return dummy.next;
    }
}
