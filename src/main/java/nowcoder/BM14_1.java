package nowcoder;//public class BM14_1 {
//    public ListNode oddEvenList(ListNode head) {
//        // write code here
//        if (head == null) {
//            return null;
//        }
//        ListNode oddHead = new ListNode(head.val);
//        ListNode oddCur = oddHead;
//        ListNode evenHead = oddCur.next;
//        ListNode evenCur = evenHead;
//        while () {
//            oddCur.next = evenCur.next;
//            oddCur = oddCur.next;
//
//            evenCur.next = oddCur.next;
//            evenCur = evenCur.next;
//        }
//        oddCur.next = evenHead;
//        return oddHead;
//    }
//}
