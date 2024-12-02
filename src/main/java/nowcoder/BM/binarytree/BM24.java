package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM24 {
    private List<Integer> lists = new ArrayList<>();

    public int[] inorderTraversal(TreeNode root) {
        lists = inOrder(root);
        return lists.stream().mapToInt(i -> i).toArray();
    }

    public List<Integer> inOrder(TreeNode root) {
        if (root == null) {
            return lists;
        }
        inOrder(root.left);
        lists.add(root.val);
        inOrder(root.right);
        return lists;
    }
}
