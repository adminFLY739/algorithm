package nowcoder.BM.heap_stack_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BM48 {
    List<Integer> lists = new ArrayList<>();

    public void Insert(Integer num) {
        lists.add(num);
    }

    public Double GetMedian() {
        lists.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        if (lists.size() % 2 == 0) {
            return (double) (lists.get((lists.size() - 1) / 2) + lists.get((lists.size() - 1) / 2 + 1)) / 2;
        } else {
            return (double) lists.get((lists.size() - 1) / 2);
        }
    }
}
