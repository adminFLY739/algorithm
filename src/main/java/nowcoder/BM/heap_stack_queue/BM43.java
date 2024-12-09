package nowcoder.BM.heap_stack_queue;

import java.util.ArrayList;

public class BM43 {
    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int node) {
        stack.add(node);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int min() {
        int min = stack.get(0);
        for (Integer integer : stack) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }
}
