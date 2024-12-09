package nowcoder.BM.heap_stack_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class BM45 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (size == 0) {
            return new ArrayList<>();
        }
        int[] tempArray;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length - size + 1; i++) {
            tempArray = Arrays.copyOfRange(num, i, i + size);
            result.add(Arrays.stream(tempArray).max().getAsInt());
        }
        return result;
    }
}
