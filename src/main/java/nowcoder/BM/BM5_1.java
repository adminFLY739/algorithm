package nowcoder.BM;

import java.util.ArrayList;

public class BM5_1 extends BM4_1 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // write code here
        if (lists == null || lists.isEmpty()) {
            return null;
        }
        return getList(lists, 0, lists.size() - 1);
    }

    public ListNode getList(ArrayList<ListNode> lists, int start, int end) {
        if (start == end) {
            return lists.get(start);
        }
        // 若只有一个链表，直接返回该链表
        int mid = (start + end) / 2;
        return Merge(getList(lists, start, mid), getList(lists, mid + 1, end));
    }
}