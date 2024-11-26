package nowcoder.BM;

import java.util.HashSet;
import java.util.Set;

public class BM7 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        Set<ListNode> set = new HashSet<>();
        if (pHead == null || pHead.next == null) {
            return null;
        }
        while (pHead.next != null) {
            if (!set.add(pHead)) {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }
}
