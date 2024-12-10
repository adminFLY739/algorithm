package nowcoder.BM.heap_stack_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class BM46 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        Arrays.sort(input);
        input = Arrays.copyOf(input, k);
        ArrayList<Integer> lists = new ArrayList<>();
        for (int n : input) {
            lists.add(n);
        }
        return lists;
    }
}
