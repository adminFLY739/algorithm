package nowcoder;

public class BM13_1 {
    public boolean isPail(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return true;
        }
        ListNode temp = cloneList(head);
        ListNode newHead = ReverseList(temp);
        while (newHead != null && head != null) {
            if (newHead.val != head.val) {
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = new ListNode(0);
        cur.next = head;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = cur.next;
            cur.next = next;
        }
        return cur.next;
    }

    public ListNode cloneList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode cur = head.next;
        ListNode newCur = newHead;
        while (cur != null) {
            ListNode temp = new ListNode(cur.val);
            newCur.next = temp;
            newCur = temp;
            cur = cur.next;
        }
        return newHead;
    }
}
