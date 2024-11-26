package nowcoder.BM.linkedlist;

import java.util.Stack;

public class BM1_2 {
    public ListNode ReverseList(ListNode head) {
        // write code here
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()) {
            return null;
        }
        ListNode newHead = stack.pop();
        ListNode pre = newHead;
        while (!stack.isEmpty()) {
            ListNode next = stack.pop();
            pre.next = next;
            pre = next;
        }
        // 防止构成环
        pre.next = null;
        return newHead;
    }
}