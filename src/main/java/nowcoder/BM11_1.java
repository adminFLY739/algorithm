package nowcoder;

public class BM11_1 {
    public ListNode ReverseList(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode cur = new ListNode(0);
        cur.next = pHead;
        while (pHead.next != null) {
            ListNode next = pHead.next;
            pHead.next = next.next;
            next.next = cur.next;
            cur.next = next;
        }
        return cur.next;
    }

    public ListNode addInList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        head1 = ReverseList(head1);
        head2 = ReverseList(head2);
        ListNode res = new ListNode(0);
        // 多次使用虚拟头节点
        ListNode cur = res;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int val1 = head1 == null ? 0 : head1.val;
            int val2 = head2 == null ? 0 : head2.val;
            int temp = val1 + val2 + carry;
            carry = temp / 10;
            temp %= 10;
            cur.next = new ListNode(temp);
            cur = cur.next;
            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }
        return ReverseList(res.next);
    }
}