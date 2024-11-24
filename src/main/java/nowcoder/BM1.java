package nowcoder;

public class BM1 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode end = head;
        int cnt = 1;
        while (end.next != null) {
            end = end.next;
            cnt++;
        }
        for (int i = 1; i < cnt; i++) {
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }
        return dummy.next;
    }
}