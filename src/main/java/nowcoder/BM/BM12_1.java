package nowcoder.BM;

import java.util.ArrayList;
import java.util.Collections;

public class BM12_1 {
    public ListNode sortInList(ListNode head) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        cur = head;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            cur.val = list.get(i);
            cur = cur.next;
        }
        return head;
    }
}
