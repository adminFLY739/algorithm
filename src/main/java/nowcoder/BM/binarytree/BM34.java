package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM34 {
    List<TreeNode> lists = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        lists = inOrder(root);
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).val > lists.get(i + 1).val) {
                return false;
            }
        }
        return true;
    }

    public List<TreeNode> inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return lists;
        }
        inOrder(treeNode.left);
        lists.add(treeNode);
        inOrder(treeNode.right);
        return lists;
    }
}
