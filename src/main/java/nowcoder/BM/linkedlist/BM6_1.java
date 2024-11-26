package nowcoder.BM.linkedlist;

public class BM6_1 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 快慢指针，slow不需要进行null校验；null指针没有后继指针，只需要判断前置节点；null指针也可以进行指针比较，空指针不等于任何有效对象
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}