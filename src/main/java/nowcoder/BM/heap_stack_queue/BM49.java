package nowcoder.BM.heap_stack_queue;

import java.util.Stack;

public class BM49 {
    Stack<Character> op = new Stack<>();
    Stack<Integer> num = new Stack<>();
    public int solve (String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {

            } else if (c == '+' || c == '-' || c == '*') {

            } else if (c == '(') {

            } else if (c == ')') {

            }
        }
        return 0;
    }
}
