package nowcoder.BM.linkedlist;

public class BM8_1 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        if (pHead != null) {
            ListNode fast = pHead;
            ListNode slow = pHead;
            if (k == 0) {
                return null;
            }
            for (int i = 0; i < k - 1; i++) {
                fast = fast.next;
                if (fast == null) {
                    return null;
                }
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        } else {
            return null;
        }
    }
}
