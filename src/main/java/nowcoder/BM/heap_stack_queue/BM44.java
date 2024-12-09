package nowcoder.BM.heap_stack_queue;

import java.util.Stack;

public class BM44 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                // todo
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    switch (c) {
                        case ')':
                            if (stack.peek() != '(') {
                                return false;
                            } else {
                                stack.pop();
                                break;
                            }
                        case ']':
                            if (stack.peek() != '[') {
                                return false;
                            } else {
                                stack.pop();
                                break;
                            }
                        case '}':
                            if (stack.peek() != '{') {
                                return false;
                            } else {
                                stack.pop();
                                break;
                            }
                        default:
                            break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
