//package nowcoder.BM.heap_stack_queue;
//
//import java.util.Stack;
//
//public class BM49 {
//    Stack<Integer> nums = new Stack<>();
//    Stack<Character> ops = new Stack<>();
//
//    public int solve(String s) {
//        char[] chars = s.toCharArray();
//        int num = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isDigit(chars[i])) {
//                num = num * 10 + chars[i];
//                if (i != chars.length - 1) {
//                    continue;
//                }
//            }
//            nums.push(num);
//            if (chars[i] == '+' || chars[i] == '-') {
//                if(ops.peek() == '*') {
//                    num = nums.pop() * nums.pop();
//                    nums.push(num);
//                }
//            }
//            if (chars[i] == '(') {
//                ops.push(chars[i]);
//            }
//            if (chars[i] == '*') {
//                ops.push(chars[i]);
//            }
//            if (chars[i] == ')') {
//                while (!ops.isEmpty() && ops.peek() != '(') {
//
//                }
//            }
//        }
//        // todo
//        // 出栈，计算
//        return num;
//    }
//}
