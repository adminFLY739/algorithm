package nowcoder;

import java.util.ArrayList;

public class BM5 extends BM4 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.isEmpty()) {
            return null;
        } else {
            ListNode ans = lists.remove(0);
            while (!lists.isEmpty()) {
                ListNode temp = lists.remove(0);
                ans = Merge(ans, temp);
            }
            return ans;
        }
    }
}