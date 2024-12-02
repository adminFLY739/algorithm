package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM25 {
    private List<Integer> lists = new ArrayList<>();

    public int[] postorderTraversal(TreeNode root) {
        lists = postOrder(root);
        return lists.stream().mapToInt(i -> i).toArray();
    }

    public List<Integer> postOrder(TreeNode root) {
        if (root == null) {
            return lists;
        }
        postOrder(root.left);
        postOrder(root.right);
        lists.add(root.val);
        return lists;
    }
}
