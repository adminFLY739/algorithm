package nowcoder.BM.heap_stack_queue;

import java.util.Arrays;

public class BM47 {
    public int findKth(int[] a, int n, int K) {
        Arrays.sort(a);
        return a[a.length - K];
    }
}
