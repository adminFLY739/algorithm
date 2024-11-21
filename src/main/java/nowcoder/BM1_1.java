package nowcoder;

public class BM1_1 {
    public ListNode ReverseList(ListNode head) {
        // write code here
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}