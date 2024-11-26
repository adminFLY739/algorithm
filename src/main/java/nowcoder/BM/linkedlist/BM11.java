package nowcoder.BM.linkedlist;

public class BM11 extends BM1 {
    public ListNode addInList(ListNode head1, ListNode head2) {
        head1 = ReverseList(head1);
        head2 = ReverseList(head2);
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        int flag = 0;
        ListNode end = null;
        while (cur1 != null && cur2 != null) {
            int temp = cur1.val;
            cur1.val = (cur1.val + cur2.val + flag) % 10;
            flag = (temp + cur2.val + flag) / 10;
            end = cur1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 != null) {
            while (cur1 != null) {
                int temp = cur1.val;
                cur1.val = (cur1.val + flag) % 10;
                flag = (temp + flag) / 10;
                end = cur1;
                cur1 = cur1.next;
            }
        }
        if (cur2 != null) {
            end.next = cur2;
            while (cur2 != null) {
                int temp = cur2.val;
                cur2.val = (cur2.val + flag) % 10;
                flag = (temp + flag) / 10;
                end = cur2;
                cur2 = cur2.next;
            }
        }
        if (flag != 0) {
            end.next = new ListNode(flag);
        }
        return ReverseList(head1);
    }
}