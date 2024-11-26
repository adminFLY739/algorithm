package nowcoder.BM;

public class BM15 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
            if (cur.val == temp.val) {
                temp.next = cur.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
