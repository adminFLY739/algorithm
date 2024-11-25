package nowcoder;

public class BM8 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        int count = 1;
        ListNode cur = pHead;
        if (pHead == null) {
            return null;
        }
        while (cur != null && cur.next != null) {
            cur = cur.next;
            count += 1;
        }
        cur = pHead;
        if (count < k) {
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
