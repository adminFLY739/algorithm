package nowcoder.BM.linkedlist;

public class BM2_2 extends BM1_1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        for (int i = 0; i < m - 1; i++) {
            cur = cur.next;
        }
        // cur：开始反转的节点的前置节点，避免复杂分类，虚拟头节点
        ListNode left = cur.next;
        ListNode right = cur.next;
        for (int i = 0; i < n - m; i++) {
            right = right.next;
        }
        ListNode curLast = right.next;
        // 切断原链表
        cur.next = null;
        right.next = null;
        ListNode useless = ReverseList(left);
        cur.next = right;
        left.next = curLast;
        return newHead.next;
    }
}