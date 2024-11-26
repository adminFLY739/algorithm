package nowcoder.BM.linkedlist;

public class BM2_1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        for (int i = 0; i < m - 1; i++) {
            cur = cur.next;
        }
        // cur：开始反转的节点的前置节点，避免复杂分类，虚拟头节点
        ListNode pre = cur.next;
        for (int i = 0; i < n - m; i++) {
            ListNode next = pre.next;
            pre.next = next.next;
            next.next = cur.next;
            cur.next = next;
        }
        // 不断将next插到cur之后
        return newHead.next;
    }
}