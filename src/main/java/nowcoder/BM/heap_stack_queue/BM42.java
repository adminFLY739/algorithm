package nowcoder.BM.heap_stack_queue;

import java.util.Stack;

public class BM42 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int size1 = stack1.size();
        for (int i = 0; i < size1; i++) {
            stack2.push(stack1.pop());
        }
        int top = stack2.pop();
        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }
        return top;
    }
}
