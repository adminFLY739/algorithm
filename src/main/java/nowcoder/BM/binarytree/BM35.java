package nowcoder.BM.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BM35 {
    public boolean isCompleteTree(TreeNode root) {
        boolean flag = true;
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                flag = false;
            } else {
                if (!flag) {
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
}
