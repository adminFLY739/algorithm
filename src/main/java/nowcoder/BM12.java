package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BM12 {
    public ListNode sortInList(ListNode head) {
        List<Integer> lists = new ArrayList<>();
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur != null) {
            lists.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(lists);
        cur = head;
        for (Integer list : lists) {
            cur.val = list;
            cur = cur.next;
        }
        return head;
    }
}
