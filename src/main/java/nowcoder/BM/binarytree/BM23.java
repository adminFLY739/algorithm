package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM23 {
    private List<Integer> lists = new ArrayList<>();

    public int[] preorderTraversal(TreeNode root) {
        lists = preOrder(root);
        return lists.stream().mapToInt(i -> i).toArray();
    }

    public List<Integer> preOrder(TreeNode root) {
        if (root == null) {
            return lists;
        }
        lists.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return lists;
    }
}
