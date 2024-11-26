package nowcoder.BM;

public class BM14 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode oddCur = oddDummy;
        ListNode evenCur = evenDummy;
        while (head != null && head.next != null) {
            ListNode temp = new ListNode(head.val);
            oddCur.next = temp;
            oddCur = oddCur.next;
            head = head.next;
            temp = new ListNode(head.val);
            evenCur.next = temp;
            evenCur = evenCur.next;
            head = head.next;
        }
        if (head != null) {
            oddCur.next = new ListNode(head.val);
            oddCur = oddCur.next;
        }
        oddCur.next = evenDummy.next;
        return oddDummy.next;
    }
}
